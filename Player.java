import java.util.ArrayList;

public class Player {
    public String name;
    public ArrayList<Integer> numbers = new ArrayList<>();
    public boolean isWon = false;
    public boolean isLost = false;

    public Player(String name){
        this.name = name;
    }

    public void PlayRound(int round){
        OutputHandler.showCurrentRound(round);

        OutputHandler.showCurrentScore(name, numbers);

        playDice(numbers);

        OutputHandler.showNewScore(numbers);
    }

    public void playDice(ArrayList<Integer> numbers){
        int numberOfDices = Dice.chooseNumberOfDice();
        OutputHandler.showNumberOfThrows(numberOfDices);
        OutputHandler.showThrowResult();
        for (int i = 1; i <= numberOfDices; i++){
            int diceResult = new Dice(6).throwDice();
            OutputHandler.showDiceResult(diceResult);
            numbers.add(diceResult);
        }
    }
}
