package test;


import classes.Models.Player;
import classes.Models.Square;

import classes.Models.SquareType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
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
}
