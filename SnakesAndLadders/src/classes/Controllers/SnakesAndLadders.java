package classes.Controllers;

import classes.Models.Board;
import classes.Models.Dice;
import classes.Models.Player;
import classes.Models.Square;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import classes.Config.ColorConfig;

/**
 * The SnakesAndLadders class represents the controller for a game of Snakes and Ladders.
 * It handles player registration, game initialization, and the main game loop.
 */
public class SnakesAndLadders {
    private final Board board;
    private final List<Player> players = new ArrayList<>();
    private final Dice dice;
    private boolean isWon = false;
    private final Scanner scanner;

    /**
     * Constructor for SnakesAndLadders.
     * Initializes the game board, dice, and scanner for input.
     */
    public SnakesAndLadders() {
        this.board = new Board();
        this.dice = new Dice();
        this.scanner = new Scanner(System.in);
    }

    /**
     * Registers players for the game.
     * Players enter their names through the console, and typing 'done' concludes the registration process.
     */
    public void registerPlayers() {
        System.out.println("Enter player names (press enter after each name, type 'done' to finish):");

        while (true) {
            String playerName = scanner.nextLine().trim();
            if ("done".equalsIgnoreCase(playerName) || playerName.isEmpty()) {
                if (players.isEmpty()) {
                    System.out.println("At least one player is required to start the game. Please enter a player name:");
                    continue;
                } else {
                    break;
                }
            }
            players.add(new Player(playerName));
            System.out.println("Player added: " + playerName);
        }
        System.out.println("All players registered. Press 'enter' to start the game.");
    }

    /**
     * Starts and manages the game loop.
     * Each player takes turns rolling the dice and moving their piece on the board until a winner is declared.
     */
    public void playGame() {
        registerPlayers();

        System.out.println(ColorConfig.TEXT_GREEN + "Let's play Snakes and Ladders! Press 'ENTER' to roll the dice for your turn." + ColorConfig.TEXT_RESET);
        while (!isWon) {
            for (Player player : players) {
                playTurn(player);
                if (isWon) break;
            }
        }
    }

    /**
     * Handles a single turn for the given player.
     * The player rolls the dice, moves their piece accordingly, and checks for game-ending conditions.
     *
     * @param player The current player taking their turn.
     */
    private void playTurn(Player player) {
        System.out.println("\n" + ColorConfig.TEXT_YELLOW + player.getName() + "'s turn. Press 'ENTER' to roll the dice." + ColorConfig.TEXT_RESET);
        scanner.nextLine();

        int diceRoll = dice.roll();
        System.out.println(player.getName() + " rolled a " + diceRoll);

        player.movePiece(diceRoll, board);

        Square currentSquare = board.findSquare(player.getPiece().getPosition());
        currentSquare.arrivedOn(player);

        checkWinner(player);
        if (!isWon) {
            System.out.println("Next players turn");
        }
    }

    /**
     * Checks if the given player has won the game by reaching the last square.
     *
     * @param player The player to check for a winning condition.
     */
    private void checkWinner(Player player) {
        if (player.getPiece().getPosition() >= 100) {
            System.out.println(player.getName() + " Won!");
            isWon = true;
        }
    }
}
