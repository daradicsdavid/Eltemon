package elte.eltemon;

import elte.move.FireMove;

/**
 * The type Leoton.
 */
public class Leoton extends FireEltemon {

    private static final int BASE_HP = 28;

    /**
     * Instantiates a new Leoton.
     * The id comes from the Laboratory class.
     * The moves array should be static, because non-static methods cannot be called before the super constructor.
     *
     * @param id the id
     */
    public Leoton(int id) {
        super(id, BASE_HP, moves());
    }

    /**
     * The moves function is static, meaning that it belongs to the whole class and can be called without an actual class object.
     */
    private static FireMove[] moves() {
        return new FireMove[]{
                new FireMove(4, "Ember"),
                new FireMove(6, "Fire Spin")};
    }
}
