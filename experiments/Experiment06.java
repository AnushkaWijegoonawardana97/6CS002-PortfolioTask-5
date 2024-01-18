package experiments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Experiment06 {
    class CustomPrintConsumer implements Consumer<String> {
        public void accept(String data) {
            System.out.println("Data: " + data + " - Length: " + data.length());
        }
    }

    public void execute() {
        String[] names = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank" };

        List<String> nameList = Arrays.asList(names);

        nameList.forEach(new CustomPrintConsumer());
    }

    public static void main(String[] args) {
        new Experiment06().execute();
    }
}
