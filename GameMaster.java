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
        for(int i = 0; i < numberOfRounds && !isGameOver(); i++){  //isGameOver False
            if (coinResult){
                computers[0].thrown();
                computers[1].thrown();
            }else{
                computers[1].thrown();
                computers[0].thrown();
            }
        }
    }

}
