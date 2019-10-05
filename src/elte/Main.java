package elte;

import elte.building.Arena;
import elte.building.Laboratory;

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
        Laboratory laboratory = new Laboratory();

        Trainer trainer1 = new Trainer("GenericTrainerName1", laboratory);
        Trainer trainer2 = new Trainer("GenericTrainerName2", Arrays.asList(
                laboratory.create(), laboratory.create(), laboratory.create()
        ));

        Arena arena = new Arena(trainer1, trainer2);

        arena.battle();
    }
}
