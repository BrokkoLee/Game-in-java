import java.util.Scanner;

public class Computer extends Player {
    public Computer(String name) {
        super(name);
    }

    @Override
    public int chooseNumberOfDice(){
        return ( (int )(Math.random() * 3 + 1) );
    }

    public static Computer scanComputer(){
        Scanner reader = new Scanner(System.in);
        OutputHandler.showGetComputers();
        String name = reader.next();
        return new Computer(name);
    }

}
