package elte.building;

import elte.eltemon.Trainable;

/**
 * The type Training field.
 * Holds an array of Trainable elements.
 */
public class TrainingField {
    private final Trainable[] eltemons;

    /**
     * Instantiates a new Training field.
     * The parameter's type is a so called variable parameter,
     * meaning we can pass as many params of the same type as we need, and it packages it into an array.
     * Trainable[] eltemons is the same as Trainable... eltemons.
     * @param eltemons the eltemons
     */
    public TrainingField(Trainable... eltemons) {
        this.eltemons = eltemons;
    }

    /**
     * Run training.
     * A foreach (for without index) loop calls the train function of every Trainable.
     */

    /*
    EXERCISE: Run the training on every Trainable
     */
    public void runTraining() {

    }
}
