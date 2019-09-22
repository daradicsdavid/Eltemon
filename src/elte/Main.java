package elte;

import elte.building.Arena;
import elte.eltemon.Crazepie;
import elte.eltemon.Eltemon;
import elte.eltemon.Leoton;

public class Main {

    public static void main(String[] args) {

        Eltemon eltemon1 = new Crazepie();
        Eltemon eltemon2 = new Leoton();

        Arena arena = new Arena(eltemon1, eltemon2);

        arena.battle();
    }
}
