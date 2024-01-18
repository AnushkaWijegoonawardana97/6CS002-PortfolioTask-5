package experiments;

import java.util.stream.Stream;

public class Experiment14 {
    class CustomStreamBuilder {
        public Stream<String> build() {
            Stream.Builder<String> builder = Stream.builder();
            builder.add("Alice");
            builder.add("Bob");
            builder.add("Charlie");
            builder.add("David");
            builder.add("Eva");
            builder.add("Frank");
            builder.add("Grace");
            return builder.build();
        }
    }

    public void processData() {
        CustomStreamBuilder customStreamBuilder = new CustomStreamBuilder();
        Stream<String> dataStream = customStreamBuilder.build();

        System.out.println("Generated Data\n---------------");
        dataStream.forEach(data -> {
            String processedData = process(data);
            System.out.println(processedData);
        });
    }

    private String process(String item) {
        // Add your complex data processing logic here
        return "Processed: " + item.toUpperCase();
    }

    public static void main(String[] args) {
        new Experiment14().processData();
    }
}
