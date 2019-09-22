package elte.eltemon;

import elte.move.GrassMove;

public class Specybara extends GrassEltemon {
    private static final int BASE_HP = 25;

    public Specybara(int id) {
        super(id, BASE_HP, moves());
    }

    private static GrassMove[] moves() {
        return new GrassMove[]{
                new GrassMove(5, "Leaf Blade"),
                new GrassMove(7, "Bullet Seed")};
    }
}
