package experiments;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Experiment16 {
    public static void main(String[] args) {
        Supplier<String> customDataProvider = new Supplier<String>() {
            public String get() {
                LocalDateTime dateTime = LocalDateTime.now();
                return "Timestamp: " + dateTime;
            }
        };

        System.out.println("Generated Data\n---------------");
        System.out.println(customDataProvider.get());
    }
}
