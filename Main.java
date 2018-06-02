import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        int rounds = 3;
        int maxComputers = 5;
        ArrayList<Computer> computers = new ArrayList<>();

        GameMaster.inputComputers(computers, maxComputers);

        GameMaster gameMaster = new GameMaster(computers, rounds);
        OutputHandler.introduction(computers);
        gameMaster.handleGame(rounds);
    }
}