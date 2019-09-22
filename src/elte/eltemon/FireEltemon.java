package elte.eltemon;

import elte.move.FireMove;
import elte.move.Move;
import elte.util.ConsoleLogger;

/**
 * The type Fire eltemon. Subclass of Eltemon.
 */
public abstract class FireEltemon extends Eltemon {

    /**
     * Instantiates a new Fire eltemon.
     *
     * @param id    the id
     * @param hp    the hp
     * @param moves the moves
     */
    FireEltemon(int id, int hp, FireMove[] moves) {
        super(id, hp, moves);
    }


    /**
     * Implementation of Trainable interface. It increases the hp and attackBonus by 1
     */

    /**
     * EXERCISE: Increase the hp and attackBonus by 1.
     */
    @Override
    public void train() {
    }


    /**
     * The defender uses this function to calculate the actual damage by the passed move parameter.
     * The formula:
     * SAME->SAME: Normal damage
     * WATER->FIRE: damage * 2
     * GRASS->FIRE: damage / 2
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
