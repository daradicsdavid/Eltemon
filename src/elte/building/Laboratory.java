package elte.building;

import elte.eltemon.Crazepie;
import elte.eltemon.Eltemon;
import elte.eltemon.Leoton;
import elte.eltemon.Specybara;
import elte.util.Random;

/**
 * The type Laboratory. Creates Eltemons.
 */
public class Laboratory {
    private static int id = 0;

    /**
     * Create eltemon. First increases the id variable.
     * Then generates a random number between 1 and 3.
     * If the number is 1 then makes a Water pokemon, if 2 then Fire, if 3 then a Grass Eltemon.
     * Passes the id to the newly created Eltemon as constructor parameter.
     *
     * @return the eltemon
     */
    public Eltemon create() {
        id++;
        int randomType = Random.choice(3);
        switch (randomType) {
            case 1:
                return new Crazepie(id);
            case 2:
                return new Leoton(id);
            default:
                return new Specybara(id);
        }
    }
}
