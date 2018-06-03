import java.util.ArrayList;
import java.util.Scanner;

public class GameMaster {
    private ArrayList<Computer> computers;
    private int numberOfRounds;
    private boolean drawBoolean = true;

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

    private void playerWin(Computer computer){
        int playerScore = Functions.sum(computer.numbers);
        if (playerScore == 21){
            computer.isWon = true;
            drawBoolean = false;
            setAllisLostToFalse();
            OutputHandler.showWinner(computer);
        }
    }

    private static void playerLost(Computer computer){
        int playerScore = Functions.sum(computer.numbers);
        if (playerScore > 21){
            computer.isLost = true;
            OutputHandler.showLoser(computer);
        }
    }

    private void checkPlayerStatus(Computer computer){
        playerWin(computer);
        playerLost(computer);
    }

    private void setAllisLostToFalse(){
        for (Computer computer : computers) {
            computer.isLost = true;
        }
    }

    private static void draw(ArrayList<Computer> computers){
        boolean zeroPlayer = true;
        for (Computer computer:computers){
            int computerScore = Functions.sum(computer.numbers);
            int highestPoint = Functions.maxPoint(computers);
            if (computerScore == highestPoint){
                zeroPlayer = false;
                OutputHandler.showDrawWinner(computer, highestPoint);
                break;
            }
        }
        if (zeroPlayer)
            OutputHandler.showZeroPlayersLeft();

    }

    public void handleGame(int round) {
        for (int i = 0; i < round; i++) {
            OutputHandler.showCurrentRound(i+1);
            for (Computer computer : computers) {
                if (computer.isLost)
                    continue;
                computer.PlayRound();
                checkPlayerStatus(computer);
            }
        }
        if (drawBoolean)
            draw(computers);
    }
}
