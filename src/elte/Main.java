package elte;

import elte.building.Arena;
import elte.building.Laboratory;
import elte.eltemon.Eltemon;

public class Main {

    public static void main(String[] args) {
        Laboratory laboratory = new Laboratory();

        Eltemon eltemon1 = laboratory.create();
        Eltemon eltemon2 = laboratory.create();

        Arena arena = new Arena(eltemon1, eltemon2);

        arena.battle();
    }
}
