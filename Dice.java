public class Dice {
    int sides;

    public Dice(int sides){
        this.sides = sides;
    }

    public int throwDice(){
        return ( (int)(Math.random() * sides + 1) );
    }

    public static int chooseNumberOfDice(){
        return ( (int )(Math.random() * 3 + 1) );
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
