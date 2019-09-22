package elte.eltemon;

import elte.move.Move;

public abstract class GrassEltemon extends Eltemon {

    public GrassEltemon(int id, int hp, Move[] moves) {
        super(id, hp, moves);
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
