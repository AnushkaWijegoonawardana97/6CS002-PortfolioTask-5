package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Files04 {

    public static void main(String[] args) {
        String filePath = "data/moview-text.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            String result = reader.lines()
                    .map(String::toUpperCase)
                    .collect(Collectors.joining(System.lineSeparator()));

            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
