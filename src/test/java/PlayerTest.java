import org.junit.Before;
import org.junit.Test;
import player.Player;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;

    @Before
    public void before(){
        player = new Player("Falconhoof", 100);
    }

    @Test
    public void hasName() {
        assertEquals("Falconhoof", player.getName());
    }

    @Test
    public void hasHitPoints(){
        assertEquals(100, player.getHitPoints());
    }
}
