package Homework5to2;

public class Player5 extends Player implements AllPlayers {

    public Player5(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + playlist[0]);
    }

    @Override
    public void playAllSongs() {
        for (int songName = playlist.length - 1; songName >= 0; songName--) {
            System.out.print("Playing :" + playlist[songName]);
        }
        System.out.println();
    }
}