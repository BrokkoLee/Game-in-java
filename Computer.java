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
        OutputHandler.showCurrentScore(name, numbers);

        playDice(numbers);

        OutputHandler.showNewScore(numbers);
    }

    public void playDice(int[] numbers){
        int numberOfDices = Dice.chooseNumberOfDice();
        OutputHandler.showNumberOfThrows(numberOfDices);
        OutputHandler.showThrowResult();
        for (int i = 1; i <= numberOfDices; i++){
            int diceResult = new Dice(6).throwDice();
            System.out.print(diceResult + " ");
            numbers[bit] = diceResult;
            bit++;
        }
    }
}
