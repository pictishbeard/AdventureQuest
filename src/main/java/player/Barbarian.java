package player;

import weapons.Weapon;
import enemy.Enemy;

public class Barbarian extends Fighter {

    private Weapon weapon;

    public Barbarian(String name, int hitPoints, Weapon weapon) {
        super(name, hitPoints, weapon);
    }
    
    public void setWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

}
