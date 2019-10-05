package elte.eltemon;

import elte.move.WaterMove;

/**
 * The type Crazepie.
 */
public class Crazepie extends WaterEltemon {
    private static final int BASE_HP = 23;

    /**
     * Instantiates a new Crazepie.
     * The id comes from the Laboratory class.
     * The moves array should be static, because non-static methods cannot be called before the super constructor.
     *
     * @param id the id
     */
    public Crazepie(int id) {
        super(id, BASE_HP, moves());
    }

    /**
     * The moves function is static, meaning that it belongs to the whole class and can be called without an actual class object.
     */
    private static WaterMove[] moves() {
        return new WaterMove[]{
                new WaterMove(6, "Whirlpool"),
                new WaterMove(8, "Hydro Pump")};
    }

    @Override
    public int getCode() {
        return EltemonCode.CRAZEPIE.code;
    }
}
