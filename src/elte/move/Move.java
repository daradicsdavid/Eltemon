package elte.move;

/**
 * The type Move.
 */
public abstract class Move {
    private final int damage;
    private final MoveType type;
    private final String name;

    /**
     * Instantiates a new Move.
     *
     * @param damage the damage
     * @param type   the type
     * @param name   the name
     */
    Move(int damage, MoveType type, String name) {
        this.damage = damage;
        this.type = type;
        this.name = name;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public MoveType getType() {
        return type;
    }

    /**
     * Gets damage.
     *
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * String representation of a Move.
     *
     * @return String
     */
    @Override
    public String toString() {
        return name + "(" + type + " " + damage + ")";
    }
}
