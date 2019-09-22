package elte.move;


/**
 * The type Fire move.
 */
public class FireMove extends Move {
    /**
     * Instantiates a new Fire move.
     * The type parameter of the Move comes from this class. We pass the enum value for FIRE from MoveType.
     *
     * @param damage the damage
     * @param name   the name
     */
    public FireMove(int damage, String name) {
        super(damage, MoveType.FIRE, name);
    }
}
