public class GameMaster {
    private Computer[] computers;
    private int numberOfRounds;

    public GameMaster(Computer[] computers, int numberOfRounds){
        this.computers = computers;
        this.numberOfRounds = numberOfRounds;
    }

    public static boolean playerWin(Computer[] computers){
        for (Computer computer : computers) {
            int playerScore = Functions.sum(computer.numbers);
            if (playerScore == 21){
                computer.isWon = true;
                System.out.println(computer.name + " has just won the game! Congratulations!");
                return true;
            }
        }
        return false;
    }

    public static boolean playerLost(Computer[] computers){
        for (Computer computer : computers) {
            int playerScore = Functions.sum(computer.numbers);
            if (playerScore > 21){
                computer.isLost = true;
                System.out.println(computer.name + " reached more than 21 points.\n The other player won.");
                return true;
            }
        }
        return false;
    }

    public static void checkPlayerStatus(Computer[] computers){
        playerWin(computers);
        playerLost(computers);
    }

    private boolean isGameOver(){
        for (Computer computer: computers) {
            checkPlayerStatus(computers);
            if(computer.isWon || computer.isLost){
                return true;
            }
        }
        return false;
    }

    public void handleGame(boolean coinResult){
        mainLoop:
        for(int i = 0; i < numberOfRounds; i++){
            if (coinResult){
                for (int j = 0; j < computers.length; j++){     //for each
                    computers[j].PlayRound();
                    if (isGameOver()) {break mainLoop;}
                }
            }else{
                for (int k = computers.length-1; k >= 0; k--){  //for each?
                    computers[k].PlayRound();
                    if (isGameOver()) {break mainLoop;}
                }
            }

            draw(i, numberOfRounds, computers);
        }
    }

    private static void draw(int currentRound, int lastRound, Computer[] computers){
        if (currentRound == lastRound-1){
            for (Computer computer:computers){
                int computerScore = Functions.sum(computer.numbers);
                int highestPoint = Functions.maxPoint(computers);
                if (computerScore == highestPoint){
                    System.out.println("No one could reach 21 points.\n" + computer.name + " won the game with the highest point (" + highestPoint +")." );
                    break;
                }
            }
        }
    }
}
