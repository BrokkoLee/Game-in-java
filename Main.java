public class Main{
    public static void main(String[] args) {
        Coin token = new Coin();
        Computer computerOne = new Computer();
        Computer computerTwo = new Computer();

        computerOne.name = "Computer_One";
        computerTwo.name = "Computer_Two";

        Functions.introduction(computerOne, computerTwo, token.bool);


    }
}