import java.io.*;

public class Files {
    public static int readFromFile() {
        try {
            InputStream file = new FileInputStream("input.txt");

            BufferedReader reader = new BufferedReader(new InputStreamReader(file));
            String line = reader.readLine();
            reader.close();
            return Integer.parseInt(line);

        } catch (Exception e) {
                return 1;  
        }
    }

    public static int calculateValue() {
        int x = readFromFile();
        return 2 * x;
    }


}
