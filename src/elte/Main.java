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

        Arena arena = new Arena(applicationState.trainers[0], applicationState.trainers[1]);

        arena.battle();

    }

}
