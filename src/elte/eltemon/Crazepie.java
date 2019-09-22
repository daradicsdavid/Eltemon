package elte.eltemon;

import elte.move.Move;

public class Crazepie extends Eltemon {
    private static final int BASE_HP = 23;

    public Crazepie() {
        super(BASE_HP, moves());
    }

    private static Move[] moves() {
        return new Move[]{new Move(7)};
    }

}
