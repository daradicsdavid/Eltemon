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

    /*
    EXERCISE: Run a battle until one of the Eltemon has 0 hp. Then declare a winner.
    Don't forget to switch the eltemon's roles, the attacker will defend, the defender will attack after each turn.
     */
    public void battle() {

    }
}
