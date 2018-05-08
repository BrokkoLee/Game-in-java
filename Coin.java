public class Coin {
    boolean bool;

    public Coin(){
        int random = (int )(Math.random()*0 + 1);
        if (random == 0){
            bool = true;
        } else {
            bool = false;
        }
    }
}
