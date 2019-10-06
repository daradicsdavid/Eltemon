package elte;

import elte.building.Arena;
import elte.building.Laboratory;
import elte.eltemon.Eltemon;
import elte.io.ApplicationState;
import elte.io.Database;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ApplicationState applicationState = Database.readFromDatabase();
        Trainer[] trainers = applicationState.trainers;
        Laboratory laboratory = new Laboratory(applicationState.eltemonIdBase);
        if (trainers.length < 2) {
            trainers = new Trainer[]{
                    new Trainer("RandomName1", laboratory),
                    new Trainer("RandomName2", laboratory)
            };
        }

        Arena arena = new Arena(trainers[0], trainers[1]);

        arena.battle();

        Database.writeToDatabase(new ApplicationState(laboratory.getId(), trainers));

    }

}
