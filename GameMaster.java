import java.util.ArrayList;
import java.util.Collections;

public class GameMaster {
    private ArrayList<Player> players;
    private int numberOfRounds;
    private boolean drawBoolean = true;

    public GameMaster(ArrayList players, int numberOfRounds){
        this.players = players;
        this.numberOfRounds = numberOfRounds;
    }

    public static void inputPlayers(ArrayList<Player> players, int computerPlayers, int humanPlayers){
        for (int i = 0; i < computerPlayers; i++) {
            players.add(Computer.scanComputer());
        }

        for (int i = 0; i < humanPlayers; i++) {
            players.add(Human.scanHuman());
        }

    }

    private void playerWin(Player player){
        int playerScore = Functions.sum(player.numbers);
        if (playerScore == 21){
            player.isWon = true;
            drawBoolean = false;
            setAllisLostToFalse();
            OutputHandler.showWinner(player);
        }
    }

    private static void playerLost(Player player){
        int playerScore = Functions.sum(player.numbers);
        if (playerScore > 21){
            player.isLost = true;
            OutputHandler.showLoser(player);
        }
    }

    private void checkPlayerStatus(Player player){
        playerWin(player);
        playerLost(player);
    }

    private void setAllisLostToFalse(){
        for (Player player : players) {
            player.isLost = true;
        }
    }

    private static void draw(ArrayList<Player> players){
        boolean zeroPlayer = true;
        for (Player player : players){
            int computerScore = Functions.sum(player.numbers);
            int highestPoint = Functions.maxPoint(players);
            if (computerScore == highestPoint){
                zeroPlayer = false;
                OutputHandler.showDrawWinner(player, highestPoint);
                break;
            }
        }
        if (zeroPlayer)
            OutputHandler.showZeroPlayersLeft();

    }

    public void handleRounds() {
        for (int i = 0; i < numberOfRounds; i++) {
            for (Player player : players) {
                if (player.isLost)
                    continue;
                player.PlayRound(i+1);
                checkPlayerStatus(player);
            }
        }
        if (drawBoolean)
            draw(players);
    }

    public void playGame(){
        Collections.shuffle(players);
        OutputHandler.introduction(players);
        handleRounds();
    }
}
