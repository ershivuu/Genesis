package Questions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchStringInFile {
    public static void main(String[] args) {
        String fileName = "DSA_From_Excel/Genesis/Questions/file"; // replace with the name of your file
        String searchString = "shivam"; // replace with the string you want to search for

        boolean found = false;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();

            while (line != null) {
                if (line.contains(searchString)) {
                    found = true;
                    break;
                }
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (found) {
            System.out.println("String found in file.");
        } else {
            System.out.println("String not found in file.");
        }
    }
}
