package elte.move;

public abstract class Move {
    final int damage;
    final MoveType type;
    final String name;

    public Move(int damage, MoveType type, String name) {
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
