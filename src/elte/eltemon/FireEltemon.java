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
    @Override
    public void train() {
        hp = hp + 1;
        attackBonus = attackBonus + 1;
        ConsoleLogger.log(this + " is training! Increased hp and attackBonus!");
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
