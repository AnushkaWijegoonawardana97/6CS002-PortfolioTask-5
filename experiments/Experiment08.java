package experiments;

import java.util.Arrays;
import java.util.List;

public class Experiment08 {
    public void processData() {
        String[] dataSet = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace" };

        List<String> data = Arrays.asList(dataSet);

        System.out.println("Sequential Data Processing\n--------------------------");
        data.stream().forEach(item -> {
            String processedData = process(item);
            System.out.println(processedData);
        });

        System.out.println("\nParallel Data Processing\n------------------------");
        data.parallelStream().forEach(item -> {
            String processedData = process(item);
            System.out.println(processedData);
        });
    }

    private String process(String item) {
        // Add your complex data processing logic here
        return "Processed: " + item.toUpperCase();
    }

    public static void main(String[] args) {
        new Experiment08().processData();
    }
}
