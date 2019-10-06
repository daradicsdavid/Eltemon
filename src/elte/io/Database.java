package elte.io;

import elte.Trainer;
import elte.eltemon.*;
import elte.exceptions.TooManyEltemonsException;
import elte.util.ConsoleLogger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private static final String FILE_PATH = "resources/db";
    private static final String DELIMITER = " ";

    public static ApplicationState readFromDatabase() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {

            Integer eltemonIdBase = readEltemonIdBase(br);

            Trainer[] trainers = readTrainers(br);

            return new ApplicationState(eltemonIdBase, trainers);
        } catch (IOException e) {
            ConsoleLogger.log(e.getMessage());
            return new ApplicationState();
        }
    }

    private static Trainer[] readTrainers(BufferedReader br) throws IOException {
        String name;
        List<Trainer> trainers = new ArrayList<>();
        while ((name = br.readLine()) != null) {
            try {
                Eltemon[] eltemons = readTrainerEltemons(br);
                trainers.add(new Trainer(name, eltemons));
            } catch (TooManyEltemonsException e) {
                ConsoleLogger.log("Skipping trainer:" + name);
            }
        }
        return trainers.toArray(new Trainer[0]);
    }

    private static Eltemon[] readTrainerEltemons(BufferedReader br) throws IOException {
        Eltemon[] eltemons = new Eltemon[Trainer.NUMBER_OF_ELTEMONS];
        for (int i = 0; i < Trainer.NUMBER_OF_ELTEMONS; i++) {
            String eltemonString = br.readLine();
            if (eltemonString != null) {
                eltemons[i] = readEltemon(eltemonString);
            }
        }
        return eltemons;
    }

    private static Eltemon readEltemon(String eltemonString) {
        String[] attributeStrings = eltemonString.split(DELIMITER);
        int id = Integer.parseInt(attributeStrings[0]);
        EltemonCode code = EltemonCode.toEnum(Integer.parseInt(attributeStrings[1]));

        switch (code) {
            case LEOTON:
                return new Leoton(id);
            case CRAZEPIE:
                return new Crazepie(id);
            case SPECYBARA:
            default:
                return new Specybara(id);
        }
    }

    private static Integer readEltemonIdBase(BufferedReader br) throws IOException {
        return Integer.valueOf(br.readLine());
    }

    public static void writeToDatabase(ApplicationState applicationState) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FILE_PATH))) {
            pw.println(applicationState.eltemonIdBase);
            writeTrainers(pw, applicationState.trainers);
        } catch (IOException e) {
            ConsoleLogger.log(e.getMessage());
        }
    }

    private static void writeTrainers(PrintWriter pw, Trainer[] trainers) {
        for (Trainer trainer : trainers) {
            pw.println(trainer.name);
            writeEltemons(pw, trainer.eltemons);
        }
    }

    private static void writeEltemons(PrintWriter pw, Eltemon[] eltemons) {
        for (Eltemon eltemon : eltemons) {
            pw.format("%d %d %n", eltemon.id, eltemon.getCode());
        }
    }
}
