package classes;

public class SquareFactory {
    public static Square createSquare(int number) {
        if (GameConfigurations.SNAKE_HEADS_AND_TAILS.containsKey(number)) {
            return new SnakeSquare(number, GameConfigurations.SNAKE_HEADS_AND_TAILS.get(number));
        }
        if (GameConfigurations.LADDER_BOTTOMS_AND_TOPS.containsKey(number)){
            return new LadderSquare(number, GameConfigurations.LADDER_BOTTOMS_AND_TOPS.get(number));
        }
        else {
            return new NormalSquare(number);
        }
    }
}
