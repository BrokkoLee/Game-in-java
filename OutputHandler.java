import java.util.ArrayList;

public class OutputHandler {
    public static void introduction(ArrayList<Computer> computers){
        showPlayers(computers);
        showStartingPlayer(computers);
    }

    public static void showStartingPlayer(ArrayList<Computer> computers){
        System.out.println("\nBased on the shuffle, " + computers.get(0).name + " is starting the round.\n");
    }

    public static void showPlayers(ArrayList<Computer> computers){
        System.out.println("The players are: ");
        for (Computer computer : computers) {
            System.out.print(computer.name + " ");
        }
    }

    public static void showCurrentScore(String name, int[] numbers){
        System.out.println(name + "\'s currently score: " + Functions.sum(numbers));
    }

    public static void showNewScore(int[] numbers){
        System.out.println("\nNow his score increased to: " + Functions.sum(numbers) + "\n");
    }

    public static void showThrowResult(){
        System.out.print("The result of the throw(s): ");
    }

    public static void showNumberOfThrows(int numberOfDices){
        System.out.println("He decided to throw " + numberOfDices + " times.");
    }

    public static void showGetComputers(){
        System.out.print("Enter the name of the computer: ");
    }

    public static void showWinner(Computer computer){ //Computer[] ??
        System.out.println(computer.name + " has just won the game! Congratulations!");
    }

    public static void showLoser(Computer computer){
        System.out.println(computer.name + " reached more than 21 points.\n" + computer.name + " was eliminated from the game.\n");

    }

    public static void showDrawWinner(Computer computer, int highestPoint){
        System.out.println("No one could reach 21 points.\n" + computer.name + " won the game with the highest point (" + highestPoint +")." );
    }

    public static void showDiceResult(int diceResult){
        System.out.print(diceResult + " ");
    }
}
