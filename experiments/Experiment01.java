package experiments;

public class Experiment01 {
    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Charlie", "David" };

        System.out.println(names.getClass());

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
