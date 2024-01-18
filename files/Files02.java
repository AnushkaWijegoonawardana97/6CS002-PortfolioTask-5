package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files02 {

    public static void main(String[] args) {
        String filePath = "data/moview-text.txt";

        try {
            long lineCount = countLines(filePath);
            System.out.println("Total lines in the file: " + lineCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private static long countLines(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            long lineCount = reader.lines().count();
            System.out.println("File path: " + getAbsolutePath(filePath));
            System.out.println("File name: " + getFileName(filePath));
            System.out.println("File size: " + getFileSize(filePath) + " bytes");
            return lineCount;
        }
    }

    private static String getAbsolutePath(String filePath) {
        Path path = Paths.get(filePath);
        return path.toAbsolutePath().toString();
    }

    private static String getFileName(String filePath) {
        Path path = Paths.get(filePath);
        return path.getFileName().toString();
    }

    private static long getFileSize(String filePath) throws IOException {
        return java.nio.file.Files.size(Paths.get(filePath));
    }
}
