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
        System.out.println("Enter the name of the computer: ");
        String name = reader.next();
        return new Computer(name);
    }

    private static void playerWin(Computer[] computers){
        for (Computer computer : computers) {
            int playerScore = Functions.sum(computer.numbers);
            if (playerScore == 21){
                computer.isWon = true;
                System.out.println(computer.name + " has just won the game! Congratulations!");
            }
        }
    }

    private static void playerLost(Computer[] computers){
        for (Computer computer : computers) {
            int playerScore = Functions.sum(computer.numbers);
            if (playerScore > 21){
                computer.isLost = true;
                System.out.println(computer.name + " reached more than 21 points.\n The other player won.");
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
                System.out.println("No one could reach 21 points.\n" + computer.name + " won the game with the highest point (" + highestPoint +")." );
                break;
            }
        }
    }

    public void handleGame(){
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
