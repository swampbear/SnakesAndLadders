package classes.Factories;

import classes.Config.GameConfigurations;
import classes.Models.Square;
import classes.Models.SquareType;

public class SquareFactory {
    public static Square createSquare(int number) {
        // Check if the square number is a snake head
        if (GameConfigurations.SNAKE_HEADS_AND_TAILS.containsKey(number)) {
            int tail = GameConfigurations.SNAKE_HEADS_AND_TAILS.get(number);
            // Create a square with SquareType.SNAKE and destination tail
            return new Square(number, SquareType.SNAKE, tail);
        }
        // Check if the square number is a ladder bottom
        else if (GameConfigurations.LADDER_BOTTOMS_AND_TOPS.containsKey(number)){
            int top = GameConfigurations.LADDER_BOTTOMS_AND_TOPS.get(number);
            // Create a square with SquareType.LADDER and destination top
            return new Square(number, SquareType.LADDER, top);
        }
        // If neither, it's a normal square
        else {
            return new Square(number, SquareType.NORMAL);
        }
    }
}
