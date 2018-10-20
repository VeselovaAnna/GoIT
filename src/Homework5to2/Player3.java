package Homework5to2;

public class Player3 extends Player implements AllPlayers {

    public Player3(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing : " + playlist[0]);
    }

    @Override
    public void playAllSongs() {
        for (String songName : playlist) {
            System.out.print(" Playing : " + songName);
        }
        System.out.println();
    }
}
