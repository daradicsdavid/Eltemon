package elte.util;

public class Random {
    private static java.util.Random random = new java.util.Random();

    public static boolean probability(int chance) {
        int num = random.nextInt(101);
        return chance > num;
    }
}
