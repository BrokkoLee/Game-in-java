import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        int rounds = 5;
        int maxComputers = 3;
        ArrayList<Computer> computers = new ArrayList<>();

        GameMaster.inputComputers(computers, maxComputers);

        GameMaster gameMaster = new GameMaster(computers, rounds);

        gameMaster.playGame(computers);
    }
}