public class Main{
    public static void main(String[] args) {
        boolean coinResult = Coin.throwCoin();
        int rounds = 3;
        Computer[] computers = new Computer[]{
                new Computer("Computer_One"),
                new Computer("Computer_Two")
        };
        GameMaster gameMaster = new GameMaster(computers, rounds);
        OutputHandler.introduction(computers,coinResult);
        gameMaster.handleGame(coinResult);
    }
}