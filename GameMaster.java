import java.util.Scanner;

public class GameMaster {
    private Computer[] computers;
    private int numberOfRounds;
    private boolean drawBoolean = false;

    public GameMaster(Computer[] computers, int numberOfRounds){
        this.computers = computers;
        this.numberOfRounds = numberOfRounds;
    }

    public static Computer inputComputer(){
        Scanner reader = new Scanner(System.in);
        OutputHandler.showGetComputers();
        String name = reader.next();
        return new Computer(name);
    }

    private static void playerWin(Computer[] computers){
        for (Computer computer : computers) {
            int playerScore = Functions.sum(computer.numbers);
            if (playerScore == 21){
                computer.isWon = true;
                OutputHandler.showWinner(computer);
            }
        }
    }

    private static void playerLost(Computer[] computers){
        for (Computer computer : computers) {
            int playerScore = Functions.sum(computer.numbers);
            if (playerScore > 21){
                computer.isLost = true;
                OutputHandler.showLoser(computer);
            }
        }
    }

    private static void checkPlayerStatus(Computer[] computers){
        playerWin(computers);
        playerLost(computers);
    }

    private boolean isGameOver(){
        for (Computer computer: computers) {
            checkPlayerStatus(computers);
            if(computer.isWon || computer.isLost){
                drawBoolean = true;
                return true;
            }
        }
        return false;
    }

    private static void draw(Computer[] computers){
        for (Computer computer:computers){
            int computerScore = Functions.sum(computer.numbers);
            int highestPoint = Functions.maxPoint(computers);
            if (computerScore == highestPoint){
                OutputHandler.showDrawWinner(computer, highestPoint);
                break;
            }
        }
    }

    public void handleGame(int round){
        for (int i = 0; i < round; i++) {
            for (Computer computer : computers) {
                computer.PlayRound();
                if (isGameOver())
                    break;
            }
            if (!drawBoolean){
                draw(computers);
            }
        }

    }
}
