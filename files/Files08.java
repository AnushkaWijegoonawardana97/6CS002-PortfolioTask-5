package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Files08 {
    public static void main(String[] args) {
        String filePath = "data/moview-text.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            List<String> lines = reader.lines().collect(Collectors.toList());

            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
