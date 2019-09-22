package elte.util;

public class ConsoleLogger {
    /**
     * Helper method which writes parameter to console. Since it is a static method we do not need to instantiate it.
     * It's callable from the class directly.
     *
     * @param message the message
     */
    public static void log(String message) {
        System.out.println(message);
    }
}
