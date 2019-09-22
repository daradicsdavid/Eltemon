package elte.eltemon;

import elte.move.GrassMove;
import elte.move.Move;

public class Specybara extends GrassEltemon {
    private static final int BASE_HP = 25;
    private Move[] moves;

    public Specybara(int id) {
        super(id, BASE_HP, moves());
    }

    private static Move[] moves() {
        return new Move[]{
                new GrassMove(5, "Leaf Blade"),
                new GrassMove(7, "Bullet Seed")};
    }
}
