package classes;

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
        System.out.println(newPosition);

        if(newPosition < board.getNumberOfSquares()-1) {
            System.out.println(name + "´s piece moved to square " + newPosition);
            piece.setPosition(newPosition);
        }
        else {
            System.out.println(name + " rolled to high and skips the turn");
            piece.setPosition(piece.getPosition());
        }
    };
}
