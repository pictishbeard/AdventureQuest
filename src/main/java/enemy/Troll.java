package enemy;

import player.Player;
import weapons.Weapon;

public class Troll extends Enemy {

    private Weapon weapon;

    public Troll(String name, int hitPoints, Weapon weapon) {
        super(name, hitPoints);
        this.weapon = weapon;
    }

    public void attack(Player player) {
        player.takeDamage(weapon.getAttackValue());
    }

}
