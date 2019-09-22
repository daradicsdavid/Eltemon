package elte.eltemon;

import elte.move.Move;
import elte.util.ConsoleLogger;
import elte.util.Random;

import java.util.Objects;

public abstract class Eltemon {
    protected int hp;
    protected int attackBonus = 0;
    private Move[] moves;

    Eltemon(int hp, Move[] moves) {
        this.hp = hp;
        this.moves = moves;
    }

    public boolean hasHp() {
        return hp > 0;
    }

    public void attack(Eltemon defender) {
        Move move = getMove();
        ConsoleLogger.log(this + " attacks " + defender + " with " + move);
        int damage = defender.calculateDamage(move);
        defender.decreaseHp(damage + attackBonus);
    }

    protected abstract int calculateDamage(Move move);

    private void decreaseHp(int damage) {
        hp = hp - damage;
        ConsoleLogger.log(this + " has " + hp + " hp left!");
    }


    private Move getMove() {
        int choice = Random.choice(moves.length) - 1;
        return moves[choice];
    }
}
