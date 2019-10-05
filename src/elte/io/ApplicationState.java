package elte.io;

import elte.Trainer;
import elte.building.Laboratory;

public class ApplicationState {

    public final int eltemonIdBase;

    public final Trainer[] trainers;


    ApplicationState(Trainer[] trainers) {
        this(0, trainers);
    }

    ApplicationState(int eltemonIdBase, Trainer[] trainers) {
        this.eltemonIdBase = eltemonIdBase;
        this.trainers = trainers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The current eltemon id base is:");
        sb.append(eltemonIdBase);
        sb.append(System.lineSeparator());
        for (Trainer trainer : trainers) {
            sb.append(trainer);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
