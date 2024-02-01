package classes;

public class SnakeSquare extends Square{
    private int head;
    private int tail;

    public SnakeSquare(int id, int tail){
        super(id, "Snake");
        this.head = id;
        this.tail = tail;
    }

    @Override
    public void arrivedOn(Player player) throws IllegalArgumentException {
        System.out.println("Oh no you landed on a snake square, your piece is moved to square " + tail );
        player.getPiece().setPosition(tail);
    }

}
