package elte.eltemon;

import elte.move.FireMove;
import elte.move.Move;

public abstract class FireEltemon extends Eltemon {

    FireEltemon(int hp, FireMove[] moves) {
        super(hp, moves);
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
