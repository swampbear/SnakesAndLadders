package classes;

public abstract class Square {
    private int id;
    private String type;

    public Square(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public abstract void arrivedOn(Player player);
}
