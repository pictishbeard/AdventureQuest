import org.junit.Before;
import org.junit.Test;
import player.Barbarian;
import weapons.Axe;
import weapons.Sword;
import weapons.Weapon;
import enemy.Orc;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private Weapon axe;
    private Weapon sword;
    private Orc orc;

    @Before
    public void setUp(){
        axe = new Axe(8);
        sword = new Sword(5);
        barbarian = new Barbarian("He-Man", 100, axe);
        orc = new Orc("Shagrat", 100, axe);
    }

    @Test
    public void hasName() {
        assertEquals("He-Man", barbarian.getName());
    }

    @Test
    public void hasHitPoints(){
        assertEquals(100, barbarian.getHitPoints());
    }

    @Test
    public void canChangeWeapon(){
        barbarian.setWeapon(sword);
        assertEquals(sword, barbarian.getWeapon());
    }

    @Test
    public void canAttackEnemy(){
        barbarian.attack(orc);
        assertEquals(92, orc.getHitPoints());
    }

    @Test
    public void canDefend(){
        barbarian.defend(orc);
        assertEquals(96, barbarian.getHitPoints());
    }

    @Test
    public void canHeal(){
        orc.attack(barbarian);
        orc.attack(barbarian);
        orc.attack(barbarian);
        barbarian.heal();
        assertEquals(96, barbarian.getHitPoints());
    }
}
