package elte.building;

import elte.eltemon.Crazepie;
import elte.eltemon.Eltemon;
import elte.eltemon.Leoton;
import elte.eltemon.Specybara;
import elte.util.Random;

public class Laboratory {
    public Eltemon create() {
        int randomType = Random.choice(3);
        switch (randomType) {
            case 1:
                return new Crazepie();
            case 2:
                return new Leoton();
            default:
                return new Specybara();
        }
    }
}
