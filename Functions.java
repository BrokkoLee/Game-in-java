import java.util.ArrayList;

public class Functions {
    public static int maxPoint(ArrayList<Computer> computers){
        int max = 0;
        for (Computer computer:computers) {
            int computerScore = sum(computer.numbers);
            if (computerScore > max && computerScore < 21){
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
