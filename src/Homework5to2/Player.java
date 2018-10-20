package Homework5to2;

public abstract class Player {
    public final int price;
    public String song = "Skyfall";
    public String[] playlist = new String[]{"Skyfall", "Solo", "All of me", "Yesterday", "Mama Mia"};

    public Player(final int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public abstract void playSong();

}
