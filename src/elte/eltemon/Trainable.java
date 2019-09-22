package elte.eltemon;

import elte.util.ConsoleLogger;

/**
 * The interface Trainable. Represents the capability to train.
 */
public interface Trainable {
    /**
     * Train method, since Java 8 we can add default implementation to interfaces with the default keyword.
     */
    default void train() {
        ConsoleLogger.log(this + " is training!");
    }
}
