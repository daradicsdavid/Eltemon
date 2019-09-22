package elte.eltemon;

import elte.move.Move;
import elte.util.ConsoleLogger;
import elte.util.Random;

public abstract class Eltemon implements Trainable {
    private final int id;
    protected int hp;
    protected int attackBonus = 0;
    private Move[] moves;
    private int movesSize;

    Eltemon(int id, int hp, Move[] moves) {
        this.id = id;
        this.hp = hp;
        this.moves = moves;
        movesSize = moves.length;
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

    protected final void decreaseHp(int damage) {
        hp = hp - damage;
        ConsoleLogger.log(this + " has " + hp + " hp left!");
    }

    private Move getMove() {
        int choice = Random.choice(movesSize) - 1;
        return moves[choice];
    }

    private void addMove(Move move) {
        moves[movesSize] = move;
        movesSize++;
    }

    @Override
    public String toString() {
        return getClass().getName() + id;
    }
}
