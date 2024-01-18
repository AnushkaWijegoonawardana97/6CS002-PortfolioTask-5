package experiments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Experiment12 {
    class CustomStringProcessor implements Function<String, String> {
        public String apply(String item) {
            // Add your custom processing logic here
            return item.toUpperCase() + " Processed";
        }
    }

    public void processData() {
        String[] dataSet = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace" };

        List<String> data = Arrays.asList(dataSet);

        System.out.println("Modified Data (Custom Processing)\n--------------------------------");
        data.stream()
                .map(new CustomStringProcessor())
                .forEach(processedData -> System.out.println(processedData));
    }

    public static void main(String[] args) {
        new Experiment12().processData();
    }
}
