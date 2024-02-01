package classes.test;

import org.junit.jupiter.api.Test;

import classes.Models.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    public void createPlayer(){
        Player player = new Player("John");
        assertEquals("John", player.getName());
    }
}


