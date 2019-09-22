package elte.eltemon;

import elte.move.FireMove;

public class Leoton extends FireEltemon {

    private static final int BASE_HP = 28;

    public Leoton() {
        super(BASE_HP, moves());
    }

    private static FireMove[] moves() {
        return new FireMove[]{
                new FireMove(4, "Ember"),
                new FireMove(6, "Fire Spin")};
    }
}
