import java.util.Scanner;

public class Human extends Player{
    public Human(String name) {
        super(name);
    }

    @Override
    public int chooseNumberOfDice(){
        Scanner reader = new Scanner(System.in);
        OutputHandler.showScanInNumberOfDices();
        int numberOfDices = reader.nextInt();
        return numberOfDices;
    }
}
