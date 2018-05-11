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
        for(int i = 0; i < numberOfRounds; i++){
            if (coinResult){
                for (int j = 0; j < computers.length; j++){     //for each
                    computers[j].thrown();                      //    |
                }                                               //    |
            }else{                                              //    V
                for (int k = computers.length-1; k >= 0; k--){  //for each?
                    computers[k].thrown();
                }
            }
        }
    }

}
