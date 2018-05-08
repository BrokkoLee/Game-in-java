public class Coin {
    boolean bool;

    public Coin(){
        int random = (int )(Math.random() * 2) + 1;
        if (random == 1){
            bool = true;
        } else {
            bool = false;
        }
    }
}
