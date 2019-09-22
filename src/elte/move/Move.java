package elte.move;

public abstract class Move {
    private final int damage;
    private final MoveType type;
    private final String name;

    Move(int damage, MoveType type, String name) {
        this.damage = damage;
        this.type = type;
        this.name = name;
    }

    public MoveType getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return name + "(" + type + " " + damage + ")";
    }
}
