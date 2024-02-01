package classes.Models;

import java.util.ArrayList;
import java.util.List;

import classes.Factories.SquareFactory;

public class Board {
    private List<Square> squares;
    private final int NUMBER_OF_SQUARES = 100;


    public Board(){
        squares = new ArrayList<>();
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i <= NUMBER_OF_SQUARES; i++) { // fant noko her. 
            squares.add(SquareFactory.createSquare(i));
        }
    }
    public Square findSquare(int number){
        if (number < 1 || number > 100) {
            throw new IllegalArgumentException("Invalid square");
        }
        return squares.get(number); // java.lang.IndexOutOfBoundsException: Index 100 out of bounds for length 100
    }

    public int getNumberOfSquares(){
        return NUMBER_OF_SQUARES;
    }


}
