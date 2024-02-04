package classes.Models;

public class Square {
    private int id;
    private SquareType type;
    private int destination; // For Snake and Ladder

    public Square(int id, SquareType type) {
        this.id = id;
        this.type = type;
    }

    public Square(int id, SquareType type, int destination) {
        this(id, type);
        this.destination = destination;
    }

    public SquareType getSquareType(){
        return type;
    }

    public void arrivedOn(Player player) {
        if (type == SquareType.NORMAL) {
            type.arrivedOn(player, id);
        } else {
            type.arrivedOn(player, id, destination);
        }
    }
}
