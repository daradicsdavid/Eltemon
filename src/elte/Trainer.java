package elte;

import elte.building.Laboratory;
import elte.eltemon.Eltemon;
import elte.exceptions.NoEltemonsLeftError;
import elte.exceptions.TooManyEltemonsException;

public class Trainer {
    public static final int NUMBER_OF_ELTEMONS = 3;
    public final String name;
    public final Eltemon[] eltemons;

    public Trainer(String name, Laboratory laboratory) {
        this.name = name;
        this.eltemons = new Eltemon[NUMBER_OF_ELTEMONS];
        for (int i = 0; i < NUMBER_OF_ELTEMONS; i++) {
            this.eltemons[i] = laboratory.create();
        }
    }

    public Trainer(String name, Eltemon[] eltemons) throws TooManyEltemonsException {
        this.name = name;
        if (eltemons.length > NUMBER_OF_ELTEMONS) {
            throw new TooManyEltemonsException();
        }
        this.eltemons = eltemons;
    }

    public Eltemon getBattleReadyEltemon() {
        for (Eltemon eltemon : eltemons) {
            if (eltemon.hasHp()) {
                return eltemon;
            }
        }
        throw new NoEltemonsLeftError();
    }

    public Boolean hasBattleReadyEltemon() {
        for (Eltemon eltemon : eltemons) {
            if (eltemon.hasHp()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trainer ");
        sb.append(name);
        sb.append(System.lineSeparator());
        for (Eltemon eltemon : eltemons) {
            sb.append(eltemon);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
