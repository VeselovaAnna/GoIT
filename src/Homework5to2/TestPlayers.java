package Homework5to2;

public class TestPlayers {
    public static void main(String[] args) {
        System.out.println("Player 1 ");
        Player1 player1=new Player1(100);
        player1.playSong();

        System.out.println("Player 2");
        Player2 player2 = new Player2(50);
        player2.playSong();

        System.out.println("player 3");
        Player3 player3= new Player3(30);
        player3.playSong();
        player3.playAllSongs();

        System.out.println("Player 4");
        Player4 player4 = new Player4(45);
        player4.playSong();
        player4.playAllSongs();

        System.out.println("Player 5");
        Player5 player5 = new Player5(120);
        player5.playSong();
        player5.playAllSongs();

        System.out.println("Player 6");
        Player6 player6 = new Player6(150);
        player6.playSong();
        player6.playAllSongs();
        player6.shuffle();


    }
}
