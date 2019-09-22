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
        //EXERCISE
    }

    /**
     * Implementation of Trainable interface. It increases the attackBonus by 2
     */
    @Override
    public void train() {
        //EXERCISE
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
        //EXERCISE
    }
}
