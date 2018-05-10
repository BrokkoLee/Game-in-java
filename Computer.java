public class Computer {
    public String name;
    public int[] numbers = new int[9];
    public boolean result = false;
    int bit = 0;

    public Computer(String name){
        this.name = name;
    }


    public void thrown(){
        System.out.println(name + "\'s currently score: " + Functions.sum(numbers));

        int numberOfDices = Dice.chooseNumberOfDice();
        System.out.println("He decided to throw " + numberOfDices + " times.");
        System.out.print("The result of the throw(s): ");

        for (int i = 1; i <= numberOfDices; i++){
            int diceResult = new Dice(6).throwDice();
            System.out.print(diceResult + " ");
            this.numbers[bit] = diceResult;
            bit++;
        }

        System.out.println("\nNow his score increased to: " + Functions.sum(numbers) + "\n");

        if (Functions.sum(numbers) == 21){
            result = true;
            System.out.println(name + " reached 21, Congratulations");
            System.out.println(name + " won.");
        } else if (Functions.sum(numbers) > 21) {
            result = true;
            System.out.println(name + " reached more than 21");
            System.out.println(name + " lost, the other player won.");
        }
    }
}
