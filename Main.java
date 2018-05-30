public class Main{
    public static void main(String[] args) {
        int rounds = 3;
        int maxComputers = 2;
        Computer[] computers = new Computer[maxComputers];

        GameMaster.inputComputers(computers, maxComputers);

        GameMaster gameMaster = new GameMaster(computers, rounds);
        OutputHandler.introduction(computers);
        gameMaster.handleGame(rounds);
    }
}