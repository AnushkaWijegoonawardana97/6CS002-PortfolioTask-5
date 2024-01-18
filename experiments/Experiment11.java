package experiments;

import java.util.Arrays;
import java.util.List;

public class Experiment11 {
    public void processData() {
        String[] dataSet = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace" };

        List<String> data = Arrays.asList(dataSet);

        System.out.println("Modified Data (Removing 'e')\n-----------------------------");
        data.stream()
                .map(name -> removeCharacter(name, 'e'))
                .forEach(modifiedName -> {
                    String processedData = process(modifiedName);
                    System.out.println(processedData);
                });
    }

    private String removeCharacter(String input, char character) {
        // Add your custom logic to remove a specific character
        return input.replaceAll(Character.toString(character), "");
    }

    private String process(String item) {
        // Add your complex data processing logic here
        return "Processed: " + item.toUpperCase();
    }

    public static void main(String[] args) {
        new Experiment11().processData();
    }
}
