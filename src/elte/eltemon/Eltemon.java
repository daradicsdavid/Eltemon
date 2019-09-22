package elte.eltemon;

public abstract class Eltemon {
    private int hp;

    public Eltemon(int hp) {
        this.hp = hp;
    }

    public boolean hasHp() {
        return hp != 0;
    }

    public void attack(Eltemon defender) {
        int damage = getDamage(defender);
        defender.decreaseHp(damage);
    }

    private void decreaseHp(int damage) {
        hp = hp - damage;
    }

    protected abstract int getDamage(Eltemon defender);
}
