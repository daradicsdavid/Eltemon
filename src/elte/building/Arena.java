package elte.building;

import elte.Trainer;
import elte.eltemon.Eltemon;
import elte.util.ConsoleLogger;


/**
 * The type Arena. Used to manage battles between two trainers.
 */
public class Arena {
    private final Trainer trainer1;
    private final Trainer trainer2;
    private Eltemon attacker;
    private Eltemon defender;

    public Arena(Trainer trainer1, Trainer trainer2) {
        this.trainer1 = trainer1;
        this.trainer2 = trainer2;
    }

    /**
     * Battle logic, attacker attack defender. Then they switch roles.
     * They attack each other until one of them has less then 1 hp.
     * Then the arena writes the winner to console.
     */
    public void battle() {
        do {
            attacker = trainer1.getBattleReadyEltemon();
            defender = trainer2.getBattleReadyEltemon();
            do {
                attacker.attack(defender);
                switchRoles();
            } while (attacker.hasHp());
            ConsoleLogger.log("The winner is:" + defender);
        } while (trainer1.hasBattleReadyEltemon() && trainer2.hasBattleReadyEltemon());

        if (trainer1.hasBattleReadyEltemon()) {
            ConsoleLogger.log("The winning trainer is:" + trainer1);
        } else {
            ConsoleLogger.log("The winning trainer is:" + trainer2);
        }

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
