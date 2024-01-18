package experiments;

import java.util.Arrays;
import java.util.List;

public class Experiment05 {
    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank" };

        List<String> nameList = Arrays.asList(names);

        System.out.println("List of People:");

        nameList.forEach(name -> System.out.println(name + " - Length: " + name.length()));
    }
}
