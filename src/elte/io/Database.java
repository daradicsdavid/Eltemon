package elte.io;

import elte.Trainer;
import elte.eltemon.*;
import elte.exceptions.DatabaseError;
import elte.util.ConsoleLogger;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Database {

    private static final String FILE_PATH = "resources/db";
    private static final String DELIMITER = " ";

    public static ApplicationState readFromDatabase() {
        try (Scanner sc = new Scanner(new FileReader(FILE_PATH))) {

            Integer eltemonIdBase = readEltemonIdBase(sc);
            skipToNextLine(sc);
            Trainer[] trainers = readTrainers(sc);

            return new ApplicationState(eltemonIdBase, trainers);
        } catch (IOException e) {
            throw new DatabaseError(e);
        }
    }

    private static void skipToNextLine(Scanner sc) {
        if (sc.hasNext()) {
            sc.nextLine();
        }
    }

    private static Trainer[] readTrainers(Scanner sc) {
        List<Trainer> trainers = new ArrayList<>();
        while (sc.hasNext()) {
            String name = sc.nextLine();
            Eltemon[] eltemons = readTrainerEltemons(sc);
            trainers.add(new Trainer(name, eltemons));
            skipToNextLine(sc);
        }
        return trainers.toArray(new Trainer[0]);
    }

    private static Eltemon[] readTrainerEltemons(Scanner sc) {
        Eltemon[] eltemons = new Eltemon[Trainer.NUMBER_OF_ELTEMONS];
        for (int i = 0; i < Trainer.NUMBER_OF_ELTEMONS; i++) {
            if (sc.hasNext()) {
                eltemons[i] = readEltemon(sc);
            }
        }
        return eltemons;
    }

    private static Eltemon readEltemon(Scanner sc) {
        int id = sc.nextInt();
        EltemonCode code = EltemonCode.toEnum(sc.nextInt());

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

    private static Integer readEltemonIdBase(Scanner sc) {
        return sc.nextInt();
    }
}
