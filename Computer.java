import java.util.Arrays;
import java.util.stream.*;
import java.util.Arrays;

public class Computer {
    public String name;
    public int[] numbers;
    public int[] threw;
    public boolean result;

    public void Computer(){
        name = name;
        numbers = numbers;
        threw = threw;
        result = result;
    }

    int dice(){
        return(int )(Math.random() * 6 + 1);
    }

    public void thrown(){
        int sum = IntStream.of(numbers).sum();
        System.out.println(name + "\'s currently score:" + sum);

        int chosenRound = (int )(Math.random() * 3 + 1);
        int bit = 0;
        for (int i = 1; i <= chosenRound; i++){
            int diceNumber = dice();
            this.threw[bit] = diceNumber;
            this.numbers[bit] = diceNumber;
            bit++;
        }

        System.out.println("He decided to throw " + chosenRound + " times.");
        System.out.print("The result of the throw(s): " +  Arrays.toString(threw));

        int sum1 = IntStream.of(numbers).sum();
        System.out.println("Now his score increased to: " + sum1);
        

    }
}
