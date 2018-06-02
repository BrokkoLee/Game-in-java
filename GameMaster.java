import java.util.ArrayList;
import java.util.Scanner;

public class GameMaster {
    private ArrayList<Computer> computers;
    private int numberOfRounds;
    private boolean drawBoolean = false;

    public GameMaster(ArrayList computers, int numberOfRounds){
        this.computers = computers;
        this.numberOfRounds = numberOfRounds;
    }

    public static void inputComputers(ArrayList<Computer> computers, int maxComputers){
        for (int i = 0; i < maxComputers; i++) {
            computers.add(GameMaster.scanComputer());
        }
    }

    public static Computer scanComputer(){
        Scanner reader = new Scanner(System.in);
        OutputHandler.showGetComputers();
        String name = reader.next();
        return new Computer(name);
    }

    private static void playerWin(ArrayList<Computer> computers){
        for (Computer computer : computers) {
            int playerScore = Functions.sum(computer.numbers);
            if (playerScore == 21){
                computer.isWon = true;
                OutputHandler.showWinner(computer);
            }
        }
    }

    private static void playerLost(ArrayList<Computer> computers){
        for (Computer computer : computers) {
            int playerScore = Functions.sum(computer.numbers);
            if (playerScore > 21){
                computer.isLost = true;
                //computers.remove(computer);
                OutputHandler.showLoser(computer);
            }
        }
    }

    private static void checkPlayerStatus(ArrayList<Computer> computers){
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

    private static void draw(ArrayList<Computer> computers){
        for (Computer computer:computers){
            int computerScore;                           //split ??
            computerScore = Functions.sum(computer.numbers);
            int highestPoint;                            //split
            highestPoint = Functions.maxPoint(computers);
            if (computerScore == highestPoint){
                OutputHandler.showDrawWinner(computer, highestPoint);
                break;
            }
        }
    }

    public void handleGame(int round) {
        for (int i = 0; i < round; i++) {
            OutputHandler.showCurrentRound(i+1);
            for (Computer computer : computers) {
                computer.PlayRound();
                if (isGameOver())
                    break;
            }
        }
        if (!drawBoolean) {
            draw(computers);
        }
    }

}
