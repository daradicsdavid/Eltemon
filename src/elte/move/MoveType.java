package elte.move;

public enum MoveType {
    FIRE("fire"), GRASS("grass"), WATER("water");

    private final String name;

    MoveType(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
