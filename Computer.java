import java.util.Arrays;
import java.util.stream.*;


public class Computer {
    public String name;
    public int[] numbers = new int[9];
    public int[] threw = new int[9];
    public boolean result = false;


    public Computer(String name){
        this.name = name;
    }


    public void thrown(){
        int sum = IntStream.of(numbers).sum();
        System.out.println(name + "\'s currently score: " + sum);

        int chosenRound = (int )(Math.random() * 3 + 1);
        int bit = 0;
        for (int i = 1; i <= chosenRound; i++){
            int diceNumber = Functions.dice();
            this.threw[bit] = diceNumber;
            this.numbers[bit] = diceNumber;
            bit++;
        }

        System.out.println("He decided to throw " + chosenRound + " times.");
        System.out.print("The result of the throw(s): " +  Arrays.toString(threw));
        threw = new int[9];
        int sumNumbers = IntStream.of(numbers).sum();
        System.out.println();
        System.out.println("Now his score increased to: " + sumNumbers);
        System.out.println();


        if (sumNumbers == 21){
            result = true;
            System.out.println(name + "reached 21, Congratulations");
            System.out.println(name + " won.");
        } else if (sumNumbers > 21) {
            result = true;
            System.out.println(name + " reached more than 21");
            System.out.println(name + " lost, the other player won.");
        }
    }
}
