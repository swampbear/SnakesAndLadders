package test;

import classes.Models.Piece;
import classes.Models.Player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest {
    @Test
    public void testCreatePiece(){
        Piece piece = new Piece();
        assertEquals(1, piece.getPosition());
    }

    @Test
    public void testSetPosition(){
        Piece piece = new Piece();
        piece.setPosition(42);
        assertEquals(42, piece.getPosition());
    }
}
