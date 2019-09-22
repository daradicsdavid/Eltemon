package elte.eltemon;

import elte.move.GrassMove;
import elte.move.Move;
import elte.util.ConsoleLogger;

/**
 * The type Grass eltemon.
 */
public abstract class GrassEltemon extends Eltemon {

    /**
     * Instantiates a new Grass eltemon.
     *
     * @param id    the id
     * @param hp    the hp
     * @param moves the moves
     */
    GrassEltemon(int id, int hp, GrassMove[] moves) {
        super(id, hp, moves);
    }

    /**
     * Implementation of Trainable interface. It increases the attackBonus by 2
     */
    @Override
    public void train() {
        attackBonus = attackBonus + 2;
        ConsoleLogger.log(this + " is training! Increased attackBonus!");
    }

    /**
     * The defender uses this function to calculate the actual damage by the passed move parameter.
     * The formula:
     * SAME->SAME: Normal damage
     * FIRE->GRASS: damage * 2
     * WATER->GRASS: damage / 2
     *
     * @param move
     * @return damage
     */
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
