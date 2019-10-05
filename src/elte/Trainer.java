package elte;

import elte.building.Laboratory;
import elte.eltemon.Eltemon;
import elte.exceptions.NoEltemonsLeftError;
import elte.exceptions.TooManyEltemonsError;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private final static int NUMBER_OF_ELTEMONS = 3;
    private final String name;
    private final List<Eltemon> eltemons;

    Trainer(String name, Laboratory laboratory) {
        this.name = name;
        this.eltemons = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_ELTEMONS; i++) {
            this.eltemons.add(laboratory.create());
        }
    }

    Trainer(String name, List<Eltemon> eltemons) {
        this.name = name;
        if (eltemons.size() > NUMBER_OF_ELTEMONS) {
            throw new TooManyEltemonsError();
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
