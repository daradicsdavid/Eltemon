package elte.eltemon;

import elte.move.Move;
import elte.move.WaterMove;

public abstract class WaterEltemon extends Eltemon {
    WaterEltemon(int hp, WaterMove[] moves) {
        super(hp, moves);
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
