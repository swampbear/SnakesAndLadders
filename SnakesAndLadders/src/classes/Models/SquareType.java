package classes.Models;

import classes.Config.ColorConfig;

public enum SquareType {
    NORMAL("Normal") {
        @Override
        public void arrivedOn(Player player, int position) {}

    },
    SNAKE("Snake") {
        @Override
        public void arrivedOn(Player player, int position, int destination) {
            System.out.println(ColorConfig.TEXT_BRIGHT_YELLOW + "Oh no, you landed on a snake square! Your piece is moved to square " + destination + ColorConfig.TEXT_RESET);
            player.getPiece().setPosition(destination);
        }
    },
    LADDER("Ladder") {
        @Override
        public void arrivedOn(Player player, int position, int destination) {
            System.out.println(ColorConfig.TEXT_BRIGHT_GREEN + "Great! You landed on a ladder square! Your piece moves up to square " + destination + ColorConfig.TEXT_RESET);
            player.getPiece().setPosition(destination);
        }
    };

    private String name;

    SquareType(String name) {
        this.name = name;
    }

    public void arrivedOn(Player player, int position, int destination){}

    public void arrivedOn(Player player, int position) {}

    public String getName() {
        return name;
    }
}
