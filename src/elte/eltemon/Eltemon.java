package elte.eltemon;

import elte.move.Move;
import elte.util.ConsoleLogger;
import elte.util.Random;

import java.util.Objects;

/**
 * The type Eltemon.This is the base class. Abstract means that we cannot make an object based on it.
 */
public abstract class Eltemon implements Trainable {
    private final int id;
    /**
     * The health points of the eltemon.
     */
    protected int hp;
    /**
     * The attack bonus of the eltemon, this increases every attack by it's value regardless of type.
     */
    protected int attackBonus = 0;
    /**
     * The move pool of the eltemon, every eltemon has specific moves so the base class get's it by constructor parameter.
     */
    private Move[] moves;

    /**
     * Instantiates a new Eltemon.
     *
     * @param id    the id
     * @param hp    the hp
     * @param moves the moves
     */
    Eltemon(int id, int hp, Move[] moves) {
        //EXERCISE
    }

    /**
     * Returns true if hp is greater then 0, false otherwise
     *
     * @return the boolean
     */
    public boolean hasHp() {
        //EXERCISE
    }

    /**
     * The parameter is the eltemon that will receive the damage.
     * First we select a move from the array with the getMove() function.
     * Then we calculate the damage caused by the move with the calculateDamage() function of the defender(!)
     * The last step is to decrease the defender's hp with the damage calculated, increased by the attackBonus.
     *
     * @param defender
     */
    public void attack(Eltemon defender) {
        //EXERCISE
    }

    /**
     * The defender uses this function to calculate the actual damage by the passed move parameter.
     * The formula:
     * SAME->SAME: Normal damage
     * WATER->FIRE: damage * 2
     * WATER->GRASS: damage / 2
     * FIRE->GRASS: damage * 2
     * FIRE->WATER: damage / 2
     * GRASS->WATER: damage * 2
     * GRASS->FIRE: damage / 2
     * Abstract means that every subclass needs to implement this method.
     *
     * @param move
     * @return damage
     */
    protected abstract int calculateDamage(Move move);

    /**
     * Decrease hp. The logic is the same for every class.
     *
     * @param damage the damage
     */
    protected final void decreaseHp(int damage) {
        //EXERCISE
    }


    /**
     * Chooses a random move from the array of moves.
     *
     * @return Move
     */
    private Move getMove() {
        //EXERCISE
    }


    /**
     * Writes the name of the class and the id.
     * (getClass().getName() will return the class name with the package name.)
     *
     * @return String representation of eltemon
     */
    @Override
    public String toString() {
        //EXERCISE
    }

    /**
     * First it checks if the two objects point to the same memory reference.
     * Then if not, it checks if they are the same type, if not it can return false.
     * If they are the same type it casts the parameter to Eltemon type, and checks if the id is the same.
     * The cast is necessary, because the Object type does not have an id field.
     *
     * @return Whether the two objects are the same
     */
    @Override
    public boolean equals(Object o) {
        //EXERCISE
    }

    /**
     * Generates a number from the id field.
     * This method is useful for hash based collections like HashMap, HashSet where a numerical value for an object is required for fast computation.
     *
     * @return hash representation.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
