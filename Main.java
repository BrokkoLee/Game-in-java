public class Main{
    public static void main(String[] args) {
        Coin token = new Coin();
        Computer computerOne = new Computer("Computer_One");
        Computer computerTwo = new Computer("Computer_Two");

        Functions.introduction(computerOne, computerTwo, token.bool);

        for (int game = 1; game <= 3; game++) {
            if (token.bool) {
                computerOne.thrown();
                if (computerOne.result || computerTwo.result) {
                    break;
                }
                computerTwo.thrown();
                if (computerOne.result || computerTwo.result) {
                    break;
                }
            } else {
                computerTwo.thrown();
                if (computerOne.result || computerTwo.result) {
                    break;
                }
                computerOne.thrown();
                if (computerOne.result || computerTwo.result) {
                    break;
                }
            }
            Functions.draw(game, computerOne, computerTwo);
        }

    }
}