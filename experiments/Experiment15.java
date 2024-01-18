package experiments;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Experiment15 {

    public static void main(String[] args) {
        Function<Integer, String> customFunction = new Function<Integer, String>() {
            public String apply(Integer n) {
                return "Result: " + n * 2;
            }
        };
        System.out.println(customFunction.apply(5));

        IntStream numbers = IntStream.range(1, 10);
        numbers.mapToObj(customFunction::apply)
                .forEach(result -> System.out.println(result));
    }
}
