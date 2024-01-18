package experiments;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Experiment04 {
    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank" };

        List<String> nameList = Arrays.asList(names);
        System.out.println(nameList.getClass());

        System.out.println("List of Methods Available:");

        for (Method method : nameList.getClass().getDeclaredMethods()) {
            System.out.println(method.getName());
        }
    }
}
