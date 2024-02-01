package classes;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Square> squares;
    private int number_of_squares = 100;

    public Board(){
        squares = new ArrayList<>();
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i <= number_of_squares; i++) { // fant noko her. 
            squares.add(SquareFactory.createSquare(number_of_squares));
        }
    }
    public Square findSquare(int number){
        if (number < 1 || number > 100) {
            throw new IllegalArgumentException("Invalid square");
        }
        return squares.get(number); // java.lang.IndexOutOfBoundsException: Index 100 out of bounds for length 100
    }

    public int getNumberOfSquares(){
        return number_of_squares;
    }


}
