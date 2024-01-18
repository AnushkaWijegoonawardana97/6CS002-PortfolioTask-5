package experiments;

import java.util.function.Supplier;

public class Experiment13 {
    class CustomDataProvider implements Supplier<String> {
        String[] data = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace" };
        int nextIndex = 0;

        public String get() {
            if (nextIndex < data.length) {
                return data[nextIndex++];
            }
            return null;
        }
    }

    public void processData() {
        CustomDataProvider customDataProvider = new CustomDataProvider();

        System.out.println("Generated Data\n---------------");
        for (int i = 0; i < 5; i++) {
            String generatedData = customDataProvider.get();
            if (generatedData != null) {
                String processedData = process(generatedData);
                System.out.println(processedData);
            }
        }
    }

    private String process(String item) {
        // Add your complex data processing logic here
        return "Processed: " + item.toUpperCase();
    }

    public static void main(String[] args) {
        new Experiment13().processData();
    }
}
