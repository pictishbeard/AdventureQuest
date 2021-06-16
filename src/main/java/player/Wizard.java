package player;
import enemy.Enemy;
import runes.Rune;


public class Wizard extends Mage {

    private Rune rune;

    public Wizard(String name, int hitPoints, Rune rune){
    super(name, hitPoints, rune);
}

    public Rune getRune(){
        return this.rune;
    }

    public void setRune (Rune newRune) {
        this.rune = newRune;
    }

}
