package academy.devdojo.maratonajava.javacore.G_association.test;

import academy.devdojo.maratonajava.javacore.G_association.domain.Player;
import academy.devdojo.maratonajava.javacore.G_association.domain.Team;

public class PlayerTest03 {
    public static void main(String[] args) {
        Player player_01 = new Player("Cafu");
        Player player_02 = new Player("Ronaldo");
        Player player_03 = new Player("Dida");
        Player[] players = {player_01, player_02, player_03};

        Team team = new Team("Brazil");

        team.setPlayers(players);
        player_01.setTeam(team);
        player_02.setTeam(team);
        player_03.setTeam(team);

        System.out.println("---- Players -----");
        player_01.printData();
            System.out.println("   ...   ");
        player_02.printData();
            System.out.println("   ...   ");
        player_03.printData();

        System.out.println("---- Team -----");
        team.printData();

    }
}
