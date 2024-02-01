package classes.Models;

public class Player {
    private String name;
    private Piece piece;

    public Player(String name) {

        this.name = name;
        this.piece = new Piece();
    }

    public String getName() {
        return name;
    }

    public Piece getPiece() {
        return piece;
    }

    public void movePiece(int roll, Board board) {
        int newPosition = piece.getPosition() + roll;
    
        if (newPosition <= board.getNumberOfSquares()) {
            piece.setPosition(newPosition);
            System.out.println(String.format("%s's piece moved to square %d", name, newPosition));
        } else {
            System.out.println(String.format("%s rolled too high and skips the turn", name));
        }
    }
    
}
