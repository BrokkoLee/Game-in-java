import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        int rounds = 5;
        int maxPlayers = 3;

        ArrayList<Player> players = new ArrayList<>();

        GameMaster.inputPlayer(players, maxPlayers);

        GameMaster gameMaster = new GameMaster(players, rounds);

        gameMaster.playGame();
    }
}