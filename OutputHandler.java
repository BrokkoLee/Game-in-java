public class OutputHandler {
    public static void ArraySout(int[] array){
        for(int i = 0; i < array.length; i++){
            if (array[i] == 0){
                break;
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}
