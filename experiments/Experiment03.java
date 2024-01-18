package experiments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Experiment03 {
    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank" };

        List<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList.getClass());

        System.out.println("List of People:");

        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
