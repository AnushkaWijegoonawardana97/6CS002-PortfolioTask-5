package experiments;

import java.util.Arrays;
import java.util.List;

public class Experiment09 {
    public void processData() {
        String[] dataSet = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace" };

        List<String> data = Arrays.asList(dataSet);

        System.out.println("Filtered Data (Names with 'e')\n-----------------------------");
        data.stream()
                .filter(name -> name.contains("e"))
                .forEach(filteredName -> {
                    String processedData = process(filteredName);
                    System.out.println(processedData);
                });
    }

    private String process(String item) {
        // Add your complex data processing logic here
        return "Processed: " + item.toUpperCase();
    }

    public static void main(String[] args) {
        new Experiment09().processData();
    }
}
