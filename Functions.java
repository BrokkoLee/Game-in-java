public class Functions {
    public static void introduction(Computer[] computers, int computerArraylength, boolean tokenResult){
        System.out.println("The players are: ");
        for (int i = 0; i < computerArraylength; i++){
            System.out.print(computers[i].name + " ");
        }
        if (tokenResult) {
            System.out.println("\nBased on the coin, " + computers[0].name + " is starting the round.\n");
        }else{
            System.out.println("\nBased on the coin, " + computers[1].name + " is starting the round.\n");
        }
    }

    public static void draw(int gameRound, Computer player1, Computer player2){
        if (gameRound == 3 && Functions.sum(player1.numbers) < 21 && Functions.sum(player2.numbers) < 21){
            if (Functions.sum(player1.numbers) > Functions.sum(player2.numbers)){
                System.out.println(player1.name + " has just won the game with " + Functions.sum(player1.numbers) + " points.");
            } else {
                System.out.println(player2.name + " has just won the game with " + Functions.sum(player2.numbers) + " points.");
            }
        }
    }

    
    public static int sum(int[] Array){
        int result = 0;
        for (int number : Array ){
            result += number;
        }
        return (result);
    }
}
