package elte.eltemon;

import elte.move.GrassMove;
import elte.move.Move;

public abstract class GrassEltemon extends Eltemon {

    GrassEltemon(int id, int hp, GrassMove[] moves) {
        super(hp, moves);
    }


    @Override
    protected int calculateDamage(Move move) {
        switch (move.getType()) {
            case FIRE:
                return move.getDamage() * 2;
            case WATER:
                return (int) ((double) move.getDamage() / 2);
            default:
                return move.getDamage();
        }
    }
}
