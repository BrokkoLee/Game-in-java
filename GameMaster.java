public class GameMaster {
    public Computer[] computers;
    public int numberOfRounds;

    public GameMaster(Computer[] computers, int numberOfRounds){
        this.computers = computers;
        this.numberOfRounds = numberOfRounds;
    }

    public boolean isGameOver(){
        for (Computer computer: computers) {
            if(computer.isWon){
                return true;
            }
        }
        return false;
    }

    public void handleGame(boolean coinResult){
        mainLoop:
        for(int i = 0; i < numberOfRounds; i++){
            if (coinResult){
                for (int j = 0; j < computers.length; j++){     //for each
                    computers[j].thrown();
                    if (isGameOver()) {break mainLoop;}
                }
            }else{
                for (int k = computers.length-1; k >= 0; k--){  //for each?
                    computers[k].thrown();
                    if (isGameOver()) {break mainLoop;}
                }
            }

            draw(i, numberOfRounds, computers);
        }
    }

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
}
