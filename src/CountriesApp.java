import java.util.HashMap;

/**
 * Created by jenny on 7/11/2017.
 */
public class CountriesApp {

    private static Validator Validator = new Validator();

    public static void main(String[] args) {
        countriesMaintenanceApp();
    }

    public static void countriesMaintenanceApp() {
        System.out.println("Welcome to the Countries Maintenance Application");

        menuLoop();

        System.out.println("\nBuh-bye!");
    }

    public static void menuLoop() {

        int menuSelection;

        HashMap<Integer, String> menu = new HashMap<>();

        menu.put(1, "See the list of countries");
        menu.put(2, "Add a country");
        menu.put(3, "Exit");

        do {
            for (HashMap.Entry<Integer, String> option : menu.entrySet()) {
                System.out.printf("%d - %s\n", option.getKey(), option.getValue());
            }

            menuSelection = menuSelection();

            if (menuSelection == 1) {
                CountriesTextFile.readFromFile();
            } else if (menuSelection == 2) {
                CountriesTextFile.writeToFile();
            }

        } while (menuSelection != 3);

    }

    public static int menuSelection() {
        int menuSelection;

        menuSelection = Validator.getInt("\nEnter menu number: ", "Please enter a valid menu number: ", 1, 3);

        return menuSelection;
    }
}