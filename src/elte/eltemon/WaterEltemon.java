package elte.eltemon;

import elte.move.Move;

public abstract class WaterEltemon extends Eltemon {
    WaterEltemon(int id, int hp, Move[] moves) {
        super(id, hp, moves);
    }

    @Override
    protected int calculateDamage(Move move) {
        switch (move.getType()) {
            case GRASS:
                return move.getDamage() * 2;
            case FIRE:
                return (int) ((double) move.getDamage() / 2);
            default:
                return move.getDamage();
        }
    }
}
