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
    /*
     * EXERCISE: Implement train method based on comment.
     */


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

    /**
     * EXERCISE: Code the function based on the comment above. The parameter has a type and damage field.
     * Tip: Use a switch.
     */
    @Override
    protected int calculateDamage(Move move) {
    }
}
