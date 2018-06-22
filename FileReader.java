import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<String> getValueFromFile(){
        ArrayList list = new ArrayList();
        try {
            File file = new File("I:\\Progrik\\gem\\src\\startingValues.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                list.add( (sc.next()));
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
        return list;
    }
}
