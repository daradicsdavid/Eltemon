package elte;

import elte.building.Arena;
import elte.building.Laboratory;
import elte.building.TrainingField;
import elte.eltemon.Eltemon;

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

        Eltemon eltemon1 = laboratory.create();
        Eltemon eltemon2 = laboratory.create();

        TrainingField field = new TrainingField(eltemon1, eltemon2);

        field.runTraining();

        Arena arena = new Arena(eltemon1, eltemon2);

        arena.battle();
    }
}
