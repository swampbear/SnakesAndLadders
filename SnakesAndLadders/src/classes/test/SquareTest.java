package classes.test;

import classes.*;
import classes.DEPR.LadderSquare;
import classes.DEPR.SnakeSquare;
import classes.Models.Player;
import classes.Models.Square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    public void testNormalSquare(){
        Player player = new Player("Adrian");
        Square normalSquare = new NormalSquare(1);
        normalSquare.arrivedOn(player);

        assertEquals(1, player.getPiece().getPosition());
    }
    @Test
    public void testSnakeSquare(){
        Player player = new Player("Brian");
        Square snakeSquare = new SnakeSquare(15, 2);
        snakeSquare.arrivedOn(player);

        assertEquals(2,player.getPiece().getPosition());
    }
    @Test
    public void testLadderSquare(){
        Player player = new Player("Cecilia");
        Square ladderSquare = new LadderSquare(5,25);
        ladderSquare.arrivedOn(player);

        assertEquals(25, player.getPiece().getPosition());
    }
}
