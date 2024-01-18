package experiments;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Experiment07 {
    public void execute() {
        String[] myData = { "Alex", "Sophia", "Michael", "Olivia", "Ethan", "Emma" };

        List<String> dataList = Arrays.asList(myData);

        dataList.forEach(new Consumer<String>() {
            public void accept(String value) {
                System.out.println("Value: " + value + " - Length: " + value.length());
            }
        });
    }

    public static void main(String[] args) {
        new Experiment07().execute();
    }
}
