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

        int choosenRound = (int )(Math.random() * 3 + 1);
    }

}
