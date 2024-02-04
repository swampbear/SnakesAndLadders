package test;


import classes.Models.Player;
import classes.Models.Square;

import classes.Models.SquareType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTypeTest {
    private Player player;

    public void setUp(){
        player = new Player("Anna");
    }

    //TYPE TESTS//
    @Test
    public void testNormalSquareType(){
        Square square = new Square(5, SquareType.NORMAL);
        assertEquals(SquareType.NORMAL, square.getSquareType());
    }
    @Test
    public void testSnakeSquareType(){
        Square square = new Square(5, SquareType.SNAKE);
        assertEquals(SquareType.SNAKE, square.getSquareType());
    }
    @Test
    public void testLadderSquareType(){
        Square square = new Square(5, SquareType.LADDER);
        assertEquals(SquareType.LADDER, square.getSquareType());
    }
    //TYPE TESTS//

    //ARRIVED ON TEST//
    @Test
    public void testNormalSquareMovement(){
        setUp();
        Square square = new Square(1, SquareType.NORMAL,1);
        square.arrivedOn(player);
        assertEquals(1, player.getPiece().getPosition());
    }
    @Test
    public void testSnakeSquareMovement(){
        setUp();
        Square square = new Square(15,SquareType.SNAKE, 2);
        square.arrivedOn(player);
        assertEquals(2, player.getPiece().getPosition());
    }
    @Test
    public void testLadderSquareMovement(){
        setUp();
        Square square = new Square(3, SquareType.LADDER, 20);
        square.arrivedOn(player);
        assertEquals(20, player.getPiece().getPosition());
    }

    //ARRIVED ON TEST//

}
