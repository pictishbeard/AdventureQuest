package weapons;

public abstract class Weapon {

    private int attackValue;

    public Weapon(int attackValue){
        this.attackValue = attackValue;
    }

    public int getAttackValue() {
        return attackValue;
    }
}
