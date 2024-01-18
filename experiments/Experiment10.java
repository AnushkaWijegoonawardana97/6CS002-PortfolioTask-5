package experiments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Experiment10 {

    class CustomFilter implements Predicate<String> {
        public boolean test(String item) {
            // Add your custom filtering logic here
            return item.length() > 4;
        }
    }

    public void processData() {
        String[] dataSet = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace" };

        List<String> data = Arrays.asList(dataSet);

        System.out.println("Filtered Data (Names with Length > 4)\n--------------------------------------");
        data.stream()
                .filter(new CustomFilter())
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
        new Experiment10().processData();
    }
}
