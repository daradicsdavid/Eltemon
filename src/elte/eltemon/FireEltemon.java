package elte.eltemon;

import elte.move.Move;

public abstract class FireEltemon extends Eltemon {

    public FireEltemon(int id, int hp, Move[] moves) {
        super(id, hp, moves);
    }

    @Override
    protected int calculateDamage(Move move) {
        switch (move.getType()) {
            case WATER:
                return move.getDamage() * 2;
            case GRASS:
                return (int) ((double) move.getDamage() / 2);
            default:
                return move.getDamage();
        }
    }
}
