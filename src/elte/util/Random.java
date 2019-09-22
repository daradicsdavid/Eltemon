package elte.util;

/**
 * The type Random.
 */
public class Random {
    private static java.util.Random random = new java.util.Random();

    /**
     * The parameter represents how many choices we have.
     * The random number will be the chosen number from the choices.
     * We increase it by 1 because nextInt returns a number from [0,parameter), meaning that the parameter wont be generated as a random number.
     *
     * @param choices the choices
     * @return the int
     */
    public static int choice(int choices) {
        return random.nextInt(choices) + 1;
    }
}
