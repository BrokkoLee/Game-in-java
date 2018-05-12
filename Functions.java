public class Functions {
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
    public static void draw(int currentRound, int lastRound, Computer[] computers){
        if (currentRound == lastRound){
            for (Computer computer:computers){
                int computerScore = sum(computer.numbers);
                if (computerScore == maxPoint(computers)){
                    System.out.println(computer.name + "won the game");
                }
            }
        }
    }
    public static int maxPoint(Computer[] computers){
        int max = 0;
        for (Computer computer:computers) {
            int computerScore = sum(computer.numbers);
            if (computerScore > max){
                max = computerScore;
            }
        }
        return max;
    }
    
    public static int sum(int[] Array){
        int result = 0;
        for (int number : Array ){
            result += number;
        }
        return (result);
    }
}
