package enemy;

import behaviours.IAttackPlayer;
import player.Player;
import weapons.Weapon;

public class Orc extends Enemy implements IAttackPlayer {

    private Weapon weapon;

    public Orc(int hitPoints, Weapon weapon) {
        super(hitPoints);
        this.weapon = weapon;
    }

    public void attack(Player player) {
        player.takeDamage(weapon.getAttackValue());
    }

}