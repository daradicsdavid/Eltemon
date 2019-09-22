package elte.building;

import elte.eltemon.Crazepie;
import elte.eltemon.Eltemon;
import elte.eltemon.Leoton;
import elte.eltemon.Specybara;
import elte.util.Random;

public class Laboratory {
    private static int id = 0;

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
