package elte.eltemon;

import elte.move.Move;

public class Leoton extends Eltemon {

    private static final int BASE_HP = 28;

    public Leoton() {
        super(BASE_HP, moves());
    }

    private static Move[] moves() {
        return new Move[]{new Move(5)};
    }
}
