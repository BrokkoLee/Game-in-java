public class Computer {
    public String name;
    public int[] numbers = new int[9];
    public boolean isWon = false;
    public boolean isLost = false;
    int bit = 0;

    public Computer(String name){
        this.name = name;
    }

    public void PlayRound(){
        OutputHandler.soutCurrentScore(name, numbers);

        Dice.playDice(numbers, bit);

        OutputHandler.soutNewScore(numbers);
    }
}
