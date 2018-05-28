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

        playDice(numbers, bit);

        OutputHandler.showNewScore(numbers);
    }

    public static void playDice(int[] numbers, int counter){
        int numberOfDices = Dice.chooseNumberOfDice();
        System.out.println("He decided to throw " + numberOfDices + " times.");
        System.out.print("The result of the throw(s): ");
        for (int i = 1; i <= numberOfDices; i++){
            int diceResult = new Dice(6).throwDice();
            System.out.print(diceResult + " ");
            numbers[counter] = diceResult;
            counter++;
        }
    }
}
