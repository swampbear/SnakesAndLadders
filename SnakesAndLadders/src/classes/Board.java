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
        for (int i = 1; i <= number_of_squares; i++) {
            squares.add(SquareFactory.createSquare(number_of_squares));
        }
    }
    public Square findSquare(int number){
        if (number< 1) {
            throw new IllegalArgumentException("Invalid square");
        }
        return squares.get(number);
    }

    public int getNumberOfSquares(){
        return number_of_squares;
    }


}
