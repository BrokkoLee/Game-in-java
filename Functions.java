import java.util.stream.IntStream;

public class Functions {
    public static void introduction(Computer player1, Computer player2, boolean tokenResult){
        System.out.println("The two players are: " + player1.name + " and " + player2.name);
        if (tokenResult) {
            System.out.println("Based on the coin, " + player1.name + " is starting the round.");
        }else{
            System.out.println("Based on the coin, " + player2.name + " is starting the round.");
        }
        System.out.println();
    }

    public void draw(int gameRound, Computer player1, Computer player2){
        int numbersSum1 = IntStream.of(player1.numbers).sum();
        int numbersSum2 = IntStream.of(player2.numbers).sum();
        if (gameRound == 2 && numbersSum1 < 21 && numbersSum2 < 21){
            if (numbersSum1 > numbersSum2){
                System.out.println(player1.name + " has just won the game with " + numbersSum1 + " points.");
            } else {
                System.out.println(player2.name + " has just won the game with " + numbersSum2 + " points.");
            }
        }
    }

    public static int dice(){
        return(int )(Math.random() * 6 + 1);
    }
}
