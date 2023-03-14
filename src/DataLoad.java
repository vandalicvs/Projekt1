import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DataLoad {

    public static void addAllFromFile(String filename) throws FileNotFoundException, PlantExceptions {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)));
            while (scanner.hasNextLine()) {
                String record = scanner.nextLine();
                dataLoad.add(Plant.parsePData(record));
            }
        }
}
