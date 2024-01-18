package cricket;

import java.util.Arrays;
import java.util.List;

public class Cricket02 {
    public static void main(String[] args) {
        List<CricketTeam> teams = Arrays.asList(
                new CricketTeam(1, "India", 20, 15, 2, 3, 5000, 3500, 1500, 32),
                new CricketTeam(2, "Australia", 20, 14, 3, 3, 4800, 3800, 1000, 31),
                new CricketTeam(3, "England", 20, 12, 4, 4, 4500, 3900, 600, 28),
                new CricketTeam(4, "South Africa", 20, 11, 5, 4, 4300, 3700, 600, 27),
                new CricketTeam(5, "New Zealand", 20, 10, 6, 4, 4100, 3600, 500, 26),
                new CricketTeam(6, "Pakistan", 20, 9, 7, 4, 3800, 3400, 400, 25),
                new CricketTeam(7, "West Indies", 20, 8, 8, 4, 3600, 3300, 300, 24),
                new CricketTeam(8, "Sri Lanka", 20, 7, 9, 4, 3400, 3200, 200, 23),
                new CricketTeam(9, "Bangladesh", 20, 6, 10, 4, 3200, 3100, 100, 22),
                new CricketTeam(10, "Afghanistan", 20, 5, 11, 4, 3100, 3300, -200, 20),
                new CricketTeam(11, "Zimbabwe", 20, 4, 12, 4, 3000, 3400, -400, 18),
                new CricketTeam(12, "Ireland", 20, 3, 13, 4, 2900, 3500, -600, 17),
                new CricketTeam(13, "Netherlands", 20, 2, 14, 4, 2800, 3600, -800, 15),
                new CricketTeam(14, "Scotland", 20, 1, 15, 4, 2700, 3700, -1000, 13),
                new CricketTeam(15, "UAE", 20, 0, 16, 4, 2600, 3800, -1200, 12),
                new CricketTeam(16, "Kenya", 20, 0, 0, 20, 2000, 4500, -2500, 0));

        // Process using sequential stream
        System.out.println("Sequential Stream:");
        teams.stream().forEach(x -> System.out.println(x));

        // Process using parallel stream
        System.out.println("\nParallel Stream:");
        teams.parallelStream().forEach(System.out::println);
    }
}
