public class Main{
    public static void main(String[] args) {
        boolean coinResult = Coin.throwCoin();
        int rounds = 3;
        int maxComputers = 5;
        Computer[] computers = new Computer[maxComputers];

        for (int i = 0; i < maxComputers; i++) {
            computers[i] = GameMaster.inputComputer();
        }

        GameMaster gameMaster = new GameMaster(computers, rounds);
        OutputHandler.introduction(computers,coinResult);
        gameMaster.handleGame(coinResult);
    }
}