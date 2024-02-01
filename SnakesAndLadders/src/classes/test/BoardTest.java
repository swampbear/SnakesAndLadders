package classes.test;

import classes.*;
import classes.DEPR.LadderSquare;
import classes.DEPR.SnakeSquare;
import classes.Models.Board;
import classes.Models.Square;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    private Board board;

    public void setUp(){
        this.board = new Board();
    }

    @Test
    public void testBoardInitialization(){
        setUp();
        for (int i = 1; i <= 100; i++) {
            assertNotNull(board.findSquare(i));
        }
    }
    @Test
    public void testSnakeSquares(){
        setUp();
        int head = 35;
       Square square = board.findSquare(head);
        assertInstanceOf(SnakeSquare.class, square);
    }
    @Test
    public void testLadderSquares(){
        setUp();
        int bottom = 3;
        Square square = board.findSquare(bottom);
        assertInstanceOf(LadderSquare.class, square);
    }
    @Test
    public void testNormalSquares(){
        setUp();
        Square square = board.findSquare(1);
        assertInstanceOf(NormalSquare.class, square);
    }
}
