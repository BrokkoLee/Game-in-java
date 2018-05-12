public class Functions {
    public static void draw(int currentRound, int lastRound, Computer[] computers){
        if (currentRound == lastRound-1){
            for (Computer computer:computers){
                int computerScore = sum(computer.numbers);
                int highestPoint = maxPoint(computers);
                if (computerScore == highestPoint){
                    System.out.println("No one could reach 21 points.\n" + computer.name + " won the game with the highest point (" + highestPoint +")." );
                    break;
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
