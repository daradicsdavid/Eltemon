package elte.building;

import elte.eltemon.Trainable;

public class TrainingField {
    private final Trainable[] eltemons;

    public TrainingField(Trainable... eltemons) {
        this.eltemons = eltemons;
    }

    public void runTraining() {
        for (Trainable eltemon : eltemons) {
            eltemon.train();
        }
    }
}
