package runes;

public abstract class Rune {

    private int attackValue;

    public Rune(int attackValue){
        this.attackValue = attackValue;
    }

    public int getAttackValue(){
        return this.attackValue;
    }
}
