package elte.move;

/**
 * The enum Move type.
 * It has a string name attribute, and a constructor which sets the name.
 * The values below (FIRE, GRASS, WATER) are like constants objects of the class MoveType.
 * Enums are useful, because they can acts as class objects with fields, but have limited values since they are constants.
 * Enums are working well with switches.
 * (The FireEltemon, GrassEltemon and WaterEltemon classes calculateDamage() method are an example)
 */
public enum MoveType {
    /**
     * Fire move type.
     */
    FIRE("fire"),
    /**
     * Grass move type.
     */
    GRASS("grass"),
    /**
     * Water move type.
     */
    WATER("water");

    private final String name;

    MoveType(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
