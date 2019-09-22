package elte.eltemon;

import elte.move.GrassMove;
import elte.util.ConsoleLogger;

public class Specybara extends GrassEltemon {
    private static final int BASE_HP = 25;

    public Specybara(int id) {
        super(id, BASE_HP, moves());
    }

    @Override
    public void train() {
        attackBonus = attackBonus + 2;
        ConsoleLogger.log(this + " is training! Increased attackBonus!");
    }

    private static GrassMove[] moves() {
        return new GrassMove[]{
                new GrassMove(5, "Leaf Blade"),
                new GrassMove(7, "Bullet Seed")};
    }
}
