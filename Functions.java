import java.util.ArrayList;

public class Functions {
    public static int maxPoint(ArrayList<Player> players){
        int max = 0;
        for (Player player : players) {
            int computerScore = sum(player.numbers);
            if (computerScore > max && computerScore < 21){
                max = computerScore;
            }
        }
        return max;
    }
    public static int sum(ArrayList<Integer> Array){
        int result = 0;
        for (int number : Array ){
            result += number;
        }
        return (result);
    }
}
