import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final String FILENAME = "vat-eu.csv";
        double vatPerc;

        System.out.println("DPH/VAT v EU\nChces filtrovat podle 20% DPH/VAT (Y/N)");
        Scanner userInp = new Scanner(System.in);
        String userChoice = userInp.nextLine();

        //test user zadal validni volbu
        while (!userChoice.equalsIgnoreCase("Y") && !userChoice.equalsIgnoreCase("N") ) {
            System.out.println("Neplatna volba, zvol si Y nebo N");
            userChoice = userInp.nextLine();
        }

        //test defaultni hodnoty VAT
        if (userChoice.equalsIgnoreCase("Y")) {
            vatPerc = 20;
        }
        else {
            System.out.println("Zadej vlastni hodnotu VAT/DPH");
            Scanner userInp2 = new Scanner(System.in);
            vatPerc = userInp2.nextDouble();
        }
        System.out.println(vatPerc);
    }
}