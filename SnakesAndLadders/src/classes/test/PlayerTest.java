package classes.test;

import classes.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    public void createPlayer(){
        Player player = new Player("John");
        assertEquals("John", player.getName());
    }
}


