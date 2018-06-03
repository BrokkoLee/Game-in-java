import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        int rounds = 5;
        int maxComputers = 3;

        ArrayList<Player> players = new ArrayList<>();

        players.add(new Human("Joe"));

        GameMaster.inputComputers(players, maxComputers);

        GameMaster gameMaster = new GameMaster(players, rounds);

        gameMaster.playGame(players);
    }
}