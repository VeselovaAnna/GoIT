package Homework5to2;

public class Player4 extends Player implements AllPlayers {

    public Player4(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing : " + (playlist[playlist.length - 1]));
    }

    @Override
    public void playAllSongs() {
        for (String songName : playlist) {
            System.out.print(" Playing :" + songName);
        }
        System.out.println();
    }
}
