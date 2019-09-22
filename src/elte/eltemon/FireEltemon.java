package elte.eltemon;

import elte.move.FireMove;
import elte.move.Move;
import elte.util.ConsoleLogger;

public abstract class FireEltemon extends Eltemon {

    FireEltemon(int id, int hp, FireMove[] moves) {
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
