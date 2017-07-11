import java.io.*;

/**
 * Created by jenny on 7/11/2017.
 */
public class CountriesTextFile {

    public static void createFile() {

        writeToFile();

        readFromFile();
    }

    public static void readFromFile() {
        try {
            FileReader reader = new FileReader("countries.txt");
            BufferedReader buffReader = new BufferedReader(reader);
            String line = null;
            System.out.println();
            while ((line = buffReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
            buffReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile() {
        try {
            //If the test.txt file does not exist, FileWriter will create it
            FileWriter writer = new FileWriter("countries.txt", true);
            //BufferedWriter buffWriter = new BufferedWriter(writer);
            System.out.println();
            writer.write(Validator.getString("Enter country: "));
            System.out.println("This country has been saved!\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
