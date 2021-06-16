package player;

import weapons.Weapon;

public class Barbarian extends Fighter {


    private Weapon weapon;

    public Barbarian(String name, int hitPoints, Weapon weapon) {
        super(name, hitPoints, weapon);
    }
    
    public void setWeapon(Weapon newWeapon){
        this.weapon = newWeapon;
    }
    
}
