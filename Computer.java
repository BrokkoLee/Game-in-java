public class Computer {
    public String name;
    public int[] numbers = new int[9];
    public boolean isWon = false;
    int bit = 0;

    public Computer(String name){
        this.name = name;
    }


    public void PlayRound(){
        OutputHandler.currentScore(name, numbers);

        Dice.playDice(numbers, bit);

        OutputHandler.newScore(numbers);

        if (Functions.sum(numbers) == 21){
            isWon = true;
            System.out.println(name + " reached 21, Congratulations");
            System.out.println(name + " won.");
        } else if (Functions.sum(numbers) > 21) {
            isWon = true;
            System.out.println(name + " reached more than 21");
            System.out.println(name + " lost, the other player won.");
        }
    }
}
