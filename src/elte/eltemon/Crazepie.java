package elte.eltemon;

import elte.move.Move;
import elte.move.WaterMove;

public class Crazepie extends WaterEltemon {
    private static final int BASE_HP = 23;
    private Move[] moves;

    public Crazepie(int id) {
        super(id, BASE_HP, moves());
    }

    private static Move[] moves() {
        return new Move[]{
                new WaterMove(6, "Whirlpool"),
                new WaterMove(8, "Hydro Pump")};
    }
}
