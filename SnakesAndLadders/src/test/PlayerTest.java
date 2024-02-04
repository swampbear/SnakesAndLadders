package test;

import classes.Models.Board;
import org.junit.jupiter.api.Test;

import classes.Models.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayerTest {
    Player player;

    private void setUp(){
        player = new Player("John");
    }
    @Test
    public void testCreatePlayer(){
        setUp();
        assertNotNull(player);
    }
    @Test
    public void testGetName(){
        setUp();
        assertEquals("John", player.getName());
    }
    @Test
    public void testGetPiece(){
        setUp();
        assertNotNull(player.getPiece());
    }

    @Test
    public void testMovePiece(){
        setUp();
        Board board = new Board();
        player.movePiece(5, board);
        assertEquals(6, player.getPiece().getPosition());
    }



}


