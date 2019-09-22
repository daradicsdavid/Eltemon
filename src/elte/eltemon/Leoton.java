package elte.eltemon;

import elte.move.FireMove;
import elte.move.Move;

public class Leoton extends FireEltemon {

    private static final int BASE_HP = 28;
    private Move[] moves;

    public Leoton(int id) {
        super(id, BASE_HP, moves());
    }

    private static Move[] moves() {
        return new Move[]{
                new FireMove(4, "Ember"),
                new FireMove(6, "Fire Spin")};
    }
}
