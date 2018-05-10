public class Main{
    public static void main(String[] args) {
        Coin token = new Coin();
        Computer[] computers = new Computer[]{
                new Computer("Computer_One"),
                new Computer("Computer_Two")
        };
        Functions.introduction(computers[0], computers[0], token.bool);

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