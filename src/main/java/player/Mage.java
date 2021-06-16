package player;

import behaviours.ISpell;
import enemy.Enemy;
import runes.Rune;

public class Mage extends Player implements ISpell {

    private final Rune rune;

    public Mage(String name, int hitPoints, Rune rune) {
        super(name, hitPoints);
        this.rune = rune;
    }


    @Override
    public void cast(Enemy enemy) {
        enemy.takeDamage(rune.getAttackValue());
    }
}
