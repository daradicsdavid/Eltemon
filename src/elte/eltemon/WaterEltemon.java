package elte.eltemon;

import elte.move.Move;
import elte.move.WaterMove;

/**
 * The type Water eltemon.
 */
public abstract class WaterEltemon extends Eltemon {
    /**
     * Instantiates a new Water eltemon.
     *
     * @param id    the id
     * @param hp    the hp
     * @param moves the moves
     */
    WaterEltemon(int id, int hp, WaterMove[] moves) {
        super(id, hp, moves);
    }

    /**
     * The defender uses this function to calculate the actual damage by the passed move parameter.
     * The formula:
     * SAME->SAME: Normal damage
     * GRASS->WATER: damage * 2
     * FIRE->WATER: damage / 2
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
