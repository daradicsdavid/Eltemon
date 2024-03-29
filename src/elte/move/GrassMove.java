package elte.move;

/**
 * The type Grass move.
 */
public class GrassMove extends Move {

    /**
     * Instantiates a new Grass move.
     * The type parameter of the Move comes from this class. We pass the enum value for GRASS from MoveType.
     *
     * @param damage the damage
     * @param name   the name
     */
    public GrassMove(int damage, String name) {
        super(damage, MoveType.GRASS, name);
    }
}
