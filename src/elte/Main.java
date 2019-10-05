package elte;

import elte.building.Arena;
import elte.building.Laboratory;
import elte.eltemon.Eltemon;
import elte.io.ApplicationState;
import elte.io.Database;

import java.util.Arrays;

/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     * It creates a Laboratory. The laboratory then creates two random Eltemons.
     * It creates a Training field, and we pass the two Eltemons to the training field, then we call the runTraining on the field.
     * Last we create an Arena object passing the Eltemons to the arena constructor. Then we call the battle function.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ApplicationState applicationState = Database.readFromDatabase();

        Arena arena = new Arena(applicationState.trainers[0], applicationState.trainers[1]);

        arena.battle();
    }

}
