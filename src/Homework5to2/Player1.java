package Homework5to2;

public class Player1 extends Player {

    public Player1(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing : " + song);
    }

}
