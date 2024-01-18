package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files01 {

    public static void main(String[] args) {
        processFile("data/moview-text.txt");
    }

    private static void processFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.lines()
                    .map(Files01::processLine)
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private static String processLine(String line) {
        return line.toUpperCase();
    }
}
