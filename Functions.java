public class Functions {
    public static void introduction(Computer player1, Computer player2, boolean tokenResult){
        System.out.println("The two players are:" + player1.name + "and" + player2.name);
        if (tokenResult) {
            System.out.println("Based on the coin, " + player1.name + " is starting the round.");
        }else{
            System.out.println("Based on the coin, " + player2.name + " is starting the round.");
        }
        System.out.println();
    }

    
}
