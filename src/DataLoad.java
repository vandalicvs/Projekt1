import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataLoad {

    private static List<CountryInfo> dataLoad=(new ArrayList<>());

    public static void addAllFromFile(String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)));
            while (scanner.hasNextLine()) {
                String record = scanner.nextLine();
                dataLoad.add(CountryInfo.parseCountryInfo(record));
            }
        }
}
