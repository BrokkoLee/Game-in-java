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

        }
    }
    public static int maxPoint(){
        return 0;
    }
    
    public static int sum(int[] Array){
        int result = 0;
        for (int number : Array ){
            result += number;
        }
        return (result);
    }
}
