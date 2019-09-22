package elte.building;

import elte.eltemon.Eltemon;
import elte.util.ConsoleLogger;


/**
 * The type Arena. Used to manage battles between two Eltemon.
 */
public class Arena {
    private Eltemon attacker;
    private Eltemon defender;

    /**
     * Instantiates a new Arena.
     *
     * @param eltemon1 the eltemon 1
     * @param eltemon2 the eltemon 2
     */
    public Arena(Eltemon eltemon1, Eltemon eltemon2) {
        attacker = eltemon1;
        defender = eltemon2;
    }

    /**
     * Battle logic, attacker attack defender. Then they switch roles.
     * They attack each other until one of them has less then 1 hp.
     * Then the arena writes the winner to console.
     */
    public void battle() {

        do {
            attacker.attack(defender);
            switchRoles();
        } while (attacker.hasHp() && defender.hasHp());

        ConsoleLogger.log("The winner is:" + defender);
    }

    /*
     * Switch the attacker and defender references, with the help a temporary variable.
     */
    private void switchRoles() {
        Eltemon temp = attacker;
        attacker = defender;
        defender = temp;
    }
}
