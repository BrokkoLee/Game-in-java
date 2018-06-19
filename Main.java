import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        int rounds = 5;
        int numberOfComputers = 3;
        int numberOfHumans = 1;

        ArrayList<Player> players = new ArrayList<>();

        GameMaster.inputPlayers(players, numberOfComputers, numberOfHumans);

        GameMaster gameMaster = new GameMaster(players, rounds);

        gameMaster.playGame();
    }
}