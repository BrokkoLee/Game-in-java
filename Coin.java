public class Coin {
    public static boolean throwCoin(){
        int random = (int )(Math.random() * 2) + 1;
        if (random == 1){
            return true;
        } else {
            return false;
        }
    }
}
