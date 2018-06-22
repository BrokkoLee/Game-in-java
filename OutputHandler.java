import java.util.ArrayList;

public class OutputHandler {
    public static void introduction(ArrayList<Player> players){
        showPlayers(players);
        showStartingPlayer(players);
    }

    public static void showStartingPlayer(ArrayList<Player> players){
        System.out.println("\nBased on the shuffle, " + players.get(0).name + " is starting the round.\n");
    }

    public static void showPlayers(ArrayList<Player> players){
        System.out.println("The players are: ");
        for (Player player : players) {
            System.out.print(player.name + " ");
        }
    }

    public static void showCurrentScore(String name, ArrayList<Integer> numbers){
        System.out.println(name + "\'s currently score: " + ListOperations.sum(numbers));
    }

    public static void showNewScore(ArrayList<Integer> numbers){
        System.out.println("\nNow his score increased to: " + ListOperations.sum(numbers) + "\n");
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

    public static void showGetPlayers(){
        System.out.println("Enter your name: ");
    }

    public static void showWinner(Player player){
        System.out.println(player.name + " has just won the game! Congratulations!");
    }

    public static void showLoser(Player player){
        System.out.println(player.name + " reached more than 21 points.\n" + player.name + " was eliminated from the game.\n");

    }

    public static void showDrawWinner(Player player, int highestPoint){
        System.out.println("No one could reach 21 points.\n" + player.name + " won the game with the highest point (" + highestPoint +")." );
    }

    public static void showDiceResult(int diceResult){
        System.out.print(diceResult + " ");
    }

    public static void showCurrentRound(int currentRound){
        System.out.println("Round: " + currentRound);
    }

    public static void showZeroPlayersLeft(){
        System.out.println("There is zero players left in the game. \n No one won.");
    }

    public static void showScanInNumberOfDices(){
        System.out.print("Enter how many dices do you want to throw: ");
    }
}
