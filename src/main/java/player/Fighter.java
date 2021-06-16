package player;

import behaviours.IAttackEnemy;
import enemy.Enemy;
import weapons.Weapon;

public class Fighter extends Player implements IAttackEnemy {


    private final Weapon weapon;

    public Fighter(String name, int hitPoints, Weapon weapon) {
        super(name, hitPoints);
        this.weapon = weapon;
    }


    @Override
    public void attack(Enemy enemy) {
       enemy.takeDamage(weapon.getAttackValue());
    }

}
