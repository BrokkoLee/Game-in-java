public class OutputHandler {
    public static void introduction(Computer[] computers, int computerArrayLength, boolean tokenResult){
        System.out.println("The players are: ");
        for (int i = 0; i < computerArrayLength; i++){
            System.out.print(computers[i].name + " ");
        }
        if (tokenResult) {
            System.out.println("\nBased on the coin, " + computers[0].name + " is starting the round.\n");
        }else{
            System.out.println("\nBased on the coin, " + computers[1].name + " is starting the round.\n");
        }
    }

    public static void currentScore(String name, int[] numbers){
        System.out.println(name + "\'s currently score: " + Functions.sum(numbers));
    }
}
