package files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

public class Files07 {
    public static void main(String[] args) {
        String filePath = "data/moview-text.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            Optional<String> result = reader.lines()
                    .reduce((left, right) -> left.concat(" ").concat(right));

            result.ifPresentOrElse(
                    concatenated -> System.out.println("Result is: " + concatenated),
                    () -> System.out.println("Result not present"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
