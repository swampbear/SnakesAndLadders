package classes.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Models.Board;
import classes.Models.Dice;
import classes.Models.Player;
import classes.Models.Square;

public class SnakesAndLadders{
    private final Board board;
    private final List<Player> players;
    private final Dice dice;

    private boolean isWon = false;

    public SnakesAndLadders(){
        this.board = new Board();
        this.players = new ArrayList<>();
        this.dice = new Dice();
    }

    public void playGame(){
        Player player1 = new Player("Sondre");
        Player player2 = new Player("Jobjorn");

        players.add(player1);
        players.add(player2);
        //TODO implement PLAYGAME logic

        System.out.println("Let's play Snakes and Ladders! Press 'ENTER' to activate each turn");
        while(!isWon)
        for(Player player : players){
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            int diceRoll = dice.roll();
            System.out.println(player.getName() + " rolled a " + diceRoll);
            player.movePiece(diceRoll, board);
            Square currentSquare = board.findSquare(player.getPiece().getPosition());
            currentSquare.arrivedOn(player);
            checkWinner(player);

        }
    }

    public void checkWinner(Player player){

        if(player.getPiece().getPosition() >= 100){
           System.out.println(player.getName() + "Won");
           isWon = true;
       }else {
            System.out.println("...Next player...");
        }

    }

    public void playTurn(Player player){
        //TODO implement PLAYTURN logic
    }

}

