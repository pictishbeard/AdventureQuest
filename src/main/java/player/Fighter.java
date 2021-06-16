package player;

import behaviours.IAttackEnemy;
import behaviours.IDefendPlayer;
import enemy.Orc;
import weapons.Weapon;
import enemy.Enemy;

public class Fighter extends Player implements IAttackEnemy, IDefendPlayer {


    private final Weapon weapon;

    public Fighter(String name, int hitPoints, Weapon weapon) {
        super(name, hitPoints);
        this.weapon = weapon;
    }


    @Override
    public void attack(Enemy enemy) {
       enemy.takeDamage(weapon.getAttackValue() );
    }

    public void defend(Orc orc){
        this.takeDamage(orc.getWeapon().getAttackValue() / 2);
    }

}
