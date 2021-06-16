package enemy;

import player.Player;
import weapons.Weapon;

public class Troll extends Enemy {

    private Weapon weapon;

    public Troll(int hitPoints, Weapon weapon) {
        super(hitPoints);
    }

    public void attack(Player player) {
        player.takeDamage(weapon.getAttackValue());
    }

}
