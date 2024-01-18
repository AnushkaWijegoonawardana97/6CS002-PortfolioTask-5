package files;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Files03 {

    public static void main(String[] args) {
        String filePath = "data/moview-text.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            reader.lines()
                    .filter(line -> line.toLowerCase().contains("his"))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
