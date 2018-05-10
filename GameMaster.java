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

    public void handleGame(){
    }

}
