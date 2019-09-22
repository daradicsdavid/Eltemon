package elte.eltemon;

import elte.move.Move;
import elte.util.ConsoleLogger;
import elte.util.Random;

public abstract class Eltemon {
    private int hp;
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
        defender.decreaseHp(damage);
    }

    private int calculateDamage(Move move) {
        return move.getDamage();
    }

    private void decreaseHp(int damage) {
        hp = hp - damage;
        ConsoleLogger.log(this + " has " + hp + " hp left!");
    }

    private Move getMove() {
        int choice = Random.choice(moves.length) - 1;
        return moves[choice];
    }

}
