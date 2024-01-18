package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Files06 {
    public static void main(String[] args) {
        String filePath = "data/moview-text.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String result = reader.lines()
                    .reduce(String::concat)
                    .orElse("");

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
