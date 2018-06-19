import java.util.ArrayList;

public abstract class Player {
    public String name;
    public ArrayList<Integer> numbers = new ArrayList<>();
    public boolean isWon = false;
    public boolean isLost = false;
    public Dice dice = new Dice(6);

    public Player(String name){
        this.name = name;
    }

    public abstract int chooseNumberOfDice();

    public int throwDice(int sides){
        return ( (int)(Math.random() * sides + 1) );
    }

    public void throwDices(int numberOfDices){
        for (int i = 1; i <= numberOfDices; i++){
            int diceResult = throwDice(dice.sides);
            OutputHandler.showDiceResult(diceResult);
            numbers.add(diceResult);
        }
    }

    public void PlayRound(int round){
        OutputHandler.showCurrentRound(round);

        OutputHandler.showCurrentScore(name, numbers);

        playDice();

        OutputHandler.showNewScore(numbers);
    }

    public void playDice(){
        int numberOfDices = chooseNumberOfDice();
        OutputHandler.showNumberOfThrows(numberOfDices);
        OutputHandler.showThrowResult();
        throwDices(numberOfDices);
    }
}
