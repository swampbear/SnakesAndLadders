package test;

import classes.Models.Board;


import classes.Models.Square;
import classes.Models.SquareType;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static classes.Models.SquareType.SNAKE;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    private Board board;

    private void setUp(){
        this.board = new Board();
    }

    @Test
    public void testBoardInitialization(){
        setUp();
        assertEquals(100, board.getNumberOfSquares());
    }

    @Test
    public void testValidSquareRetrieval(){
        setUp();
        for (int i = 1; i <= board.getNumberOfSquares() ; i++) {
            assertNotNull(board.findSquare(i));
        }
    }

    @Test
    public void testNormalSquareType(){
        setUp();
        Square square = board.findSquare(4);
        assertEquals(SquareType.NORMAL, square.getSquareType());
    }
    @Test
    public void testLadderSquareType(){
        setUp();
        Square square = board.findSquare(3);
        assertEquals(SquareType.LADDER, square.getSquareType());
    }
    @Test
    public void testSnakeSquareType(){
        setUp();
        Square square = board.findSquare(97);
        assertEquals(SNAKE, square.getSquareType());
    }

}
