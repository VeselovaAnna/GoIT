package Homework5to2;

import java.util.Random;

public class Player6 extends Player implements AllPlayers {

    public Player6(int price) {
        super(price);
    }

    @Override
    public void playSong() {
        System.out.println("Playing: " + playlist[0]);
    }

    @Override
    public void playAllSongs() {
        for (String songName : playlist) {
            System.out.print(" Playing :" + songName);
        }
    }

    public void shuffle() {
        Random random = new Random();
        for (int i = 1; i < playlist.length; i++) {
            int j = random.nextInt(i);
            String a = playlist[i];
            playlist[i] = playlist[j];
            playlist[j] = a;
            System.out.print(" Playing :" + a);
        }
    }
}
