public class Coin {
    public static boolean throwCoin(){
        int random = (int )(Math.random() * 2) + 1;
        return random == 1;
    }
}
