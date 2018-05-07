import java.util.stream.*;

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
    }

}
