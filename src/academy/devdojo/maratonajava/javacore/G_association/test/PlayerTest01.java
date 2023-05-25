package academy.devdojo.maratonajava.javacore.G_association.test;

import academy.devdojo.maratonajava.javacore.G_association.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player_01 = new Player("Pele");
        Player player_02 = new Player("Romario");
        Player player_03 = new Player("Cafu");

//        Player[] players = new Player[3];
//        Player[] players = new Player[]{player_01, player_02, player_03};
        Player[] players = {player_01, player_02, player_03};

        for (Player player : players) {
            player.printData();
        }

        System.out.println("From test");
    }
}
