import java.util.ArrayList;

public abstract class Player {
    public String name;
    public ArrayList<Integer> numbers = new ArrayList<>();
    public boolean isWon = false;
    public boolean isLost = false;

    public Player(String name){
        this.name = name;
    }
    public int chooseNumberOfDice(){
        return ( (int )(Math.random() * 3 + 1) );
    }

    public int throwDice(int sides){
        return ( (int)(Math.random() * sides + 1) );
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
        Dice dice = new Dice(6);
        for (int i = 1; i <= numberOfDices; i++){
            int diceResult = throwDice(dice.sides);
            OutputHandler.showDiceResult(diceResult);
            numbers.add(diceResult);
        }
    }
}
