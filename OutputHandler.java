public class OutputHandler {
    public static void introduction(Computer[] computers){
        showPlayers(computers);
        showStartingPlayer(computers);
    }
    public static void showStartingPlayer(Computer[] computers){
        System.out.println("\nBased on the coin, " + computers[0].name + " is starting the round.\n");
    }

    private static void showPlayers(Computer[] computers){
        System.out.println("The players are: ");
        for (int i = 0; i < computers.length; i++){
            System.out.print(computers[i].name + " ");
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

    public static void showLoser(Computer computer){ //Computer[] ??
        System.out.println(computer.name + " reached more than 21 points.\n The other player won.");

    }

    public static void showDrawWinner(Computer computer, int highestPoint){
        System.out.println("No one could reach 21 points.\n" + computer.name + " won the game with the highest point (" + highestPoint +")." );
    }
}
