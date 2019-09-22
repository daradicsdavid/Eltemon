package elte.building;

import elte.eltemon.Eltemon;
import elte.util.ConsoleLogger;

public class Arena {
    private Eltemon attacker;
    private Eltemon defender;

    public Arena(Eltemon eltemon1, Eltemon eltemon2) {
        attacker = eltemon1;
        defender = eltemon2;
    }

    public void battle() {

        do {
            attacker.attack(defender);
            switchRoles();
        } while (attacker.hasHp() && defender.hasHp());

        ConsoleLogger.log("The winner is:" + defender);
    }

    private void switchRoles() {
        Eltemon temp = attacker;
        attacker = defender;
        defender = temp;
    }
}
