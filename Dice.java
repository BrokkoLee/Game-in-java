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
}
