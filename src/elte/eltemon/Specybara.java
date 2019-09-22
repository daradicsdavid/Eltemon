package elte.eltemon;

import elte.move.GrassMove;

/**
 * The type Specybara.
 */
public class Specybara extends GrassEltemon {
    private static final int BASE_HP = 25;

    /**
     * Instantiates a new Specybara.
     * The id comes from the Laboratory class.
     * The moves array should be static, because non-static methods cannot be called before the super constructor.
     *
     * @param id the id
     */
    public Specybara(int id) {
        super(id, BASE_HP, moves());
    }

    /**
     * The moves function is static, meaning that it belongs to the whole class and can be called without an actual class object.
     */
    private static GrassMove[] moves() {
        return new GrassMove[]{
                new GrassMove(5, "Leaf Blade"),
                new GrassMove(7, "Bullet Seed")};
    }
}
