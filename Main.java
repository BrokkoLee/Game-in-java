import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        //TODO get variable value from file
        ArrayList<String> valueList;
        valueList = FileReader.getValueFromFile();
        final int round = Integer.parseInt(valueList.get(1));
        final int goalPoint = Integer.parseInt(valueList.get(3));
        final int computerPlayers = Integer.parseInt(valueList.get(5));
        final int humanPlayers = Integer.parseInt(valueList.get(7));

        ArrayList<Player> players = new ArrayList<>();

        GameMaster.inputPlayers(players, computerPlayers, humanPlayers);

        GameMaster gameMaster = new GameMaster(players, round);

        gameMaster.playGame();
    }
}