package Classes_Objects;

import java.util.ArrayList;
import java.util.List;

class Player {
    String name;
    Player(String name) {
        this.name = name;
    }
}
class Team {
    String teamName;
    List<Player> players = new ArrayList<>();
    Team(String teamName) {
        this.teamName = teamName;
    }
    void addPlayer(Player player) {
        players.add(player);
    }
    void showTeam() {
        System.out.println("Team : " + teamName + " has Players");
        for(Player p : players) {
            System.out.println("-" + p.name);
        }
    }
}
public class aggregationPlayer {
    public static void main(String[] args) {
        Team team = new Team("Warrriors");
        team.addPlayer(new Player("John"));
        team.addPlayer(new Player("Klay"));
        team.showTeam();
    }
}
