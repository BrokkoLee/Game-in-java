public class Computer extends Player{
    public Computer(String name) {
        super(name);
    }

    @Override
    public int chooseNumberOfDice(){
        return ( (int )(Math.random() * 3 + 1) );
    }
}
