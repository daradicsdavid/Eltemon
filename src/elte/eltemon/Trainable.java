package elte.eltemon;

import elte.util.ConsoleLogger;

public interface Trainable {
    default void train() {
        ConsoleLogger.log(this + " is training!");
    }
}
