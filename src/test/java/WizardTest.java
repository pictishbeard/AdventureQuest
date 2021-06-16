import enemy.Orc;
import org.junit.Before;
import org.junit.Test;
import player.Wizard;
import runes.Fire;
import runes.Earth;
import weapons.Weapon;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Fire fire;
    private Earth earth;
    private Wizard wizard;
    private Orc orc;
    private Weapon axe;

    @Before
    public void setUp(){
        fire = new Fire(20);
        earth = new Earth(8);
        wizard = new Wizard("Gandalf", 100, fire);
        orc = new Orc("Shagrat The Second", 100, axe);
    }

    @Test
    public void hasName() {
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void hasHitPoints(){
        assertEquals(100, wizard.getHitPoints());
    }

    @Test
    public void canChangeWeapon(){
        wizard.setRune(earth);
        assertEquals(earth, wizard.getRune());
    }

    @Test
    public void canAttackEnemy(){
        wizard.cast(orc);
        assertEquals(80, orc.getHitPoints());
    }

}
