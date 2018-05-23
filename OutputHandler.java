public class OutputHandler {
    public static void introduction(Computer[] computers,boolean tokenResult){
        showPlayers(computers);
        if (tokenResult) {
            System.out.println("\nBased on the coin, " + computers[0].name + " is starting the round.\n");
        }else{
            System.out.println("\nBased on the coin, " + computers[1].name + " is starting the round.\n");
        }
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
}
