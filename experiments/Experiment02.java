package experiments;

public class Experiment02 {
    public static void main(String[] args) {
        String[] names = { "Alice", "Bob", "Charlie", "David", "Eva", "Frank" };

        int[] ages = { 25, 30, 22, 35, 28, 40 };

        System.out.println("List of People and Their Ages:");

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i]);
        }
    }
}
