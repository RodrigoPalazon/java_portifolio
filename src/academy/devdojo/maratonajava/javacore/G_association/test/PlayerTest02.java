package academy.devdojo.maratonajava.javacore.G_association.test;

import academy.devdojo.maratonajava.javacore.G_association.domain.Player;
import academy.devdojo.maratonajava.javacore.G_association.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player player_01 = new Player("Pele");
        Team team  = new Team("Brazil");

        player_01.setTeam(team);
        player_01.printData();
    }
}
