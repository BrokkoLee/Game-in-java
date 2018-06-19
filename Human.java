import java.util.Scanner;

public class Human extends Player {
    public Human(String name) {
        super(name);
    }

    @Override
    public int chooseNumberOfDice(){
        OutputHandler.showScanInNumberOfDices();
        Scanner reader = new Scanner(System.in);
        int numberOfDices = reader.nextInt();
        return numberOfDices;
    }

    public static Human scanHuman(){
        Scanner reader = new Scanner(System.in);
        OutputHandler.showGetPlayers();
        String name = reader.next();
        return new Human(name);
    }
}
