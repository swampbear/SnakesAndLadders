package classes.Factories;

import classes.Config.GameConfigurations;
import classes.Models.Square;
import classes.Models.SquareType;

/**
 * Responeble for creating instances of squeres on the board. 
 * 
 * @return A squere of ether type NORMAL, SNAKE or LADDER.
 */
public class SquareFactory {
    public static Square createSquare(int number) {
        if (GameConfigurations.SNAKE_HEADS_AND_TAILS.containsKey(number)) {
            int tail = GameConfigurations.SNAKE_HEADS_AND_TAILS.get(number);
            return new Square(number, SquareType.SNAKE, tail);
        }
        else if (GameConfigurations.LADDER_BOTTOMS_AND_TOPS.containsKey(number)){
            int top = GameConfigurations.LADDER_BOTTOMS_AND_TOPS.get(number);
            return new Square(number, SquareType.LADDER, top);
        }
        else {
            return new Square(number, SquareType.NORMAL);
        }
    }
}
