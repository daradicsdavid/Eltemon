package elte.eltemon;

import elte.move.WaterMove;

public class Crazepie extends WaterEltemon {
    private static final int BASE_HP = 23;

    public Crazepie() {
        super(BASE_HP, moves());
    }

    private static WaterMove[] moves() {
        return new WaterMove[]{
                new WaterMove(6, "Whirlpool"),
                new WaterMove(8, "Hydro Pump")};
    }
}
