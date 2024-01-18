    package cricket;

    public class CricketTeam implements Comparable<CricketTeam> {
        private int position;
        private String team;
        private int matchesPlayed;
        private int wins;
        private int draws;
        private int losses;
        private int runsFor;
        private int runsAgainst;
        private int runDifference;
        private int points;

        public CricketTeam(int position, String team, int matchesPlayed, int wins, int draws,
                int losses, int runsFor, int runsAgainst, int runDifference, int points) {
            this.position = position;
            this.team = team;
            this.matchesPlayed = matchesPlayed;
            this.wins = wins;
            this.draws = draws;
            this.losses = losses;
            this.runsFor = runsFor;
            this.runsAgainst = runsAgainst;
            this.runDifference = runDifference;
            this.points = points;
        }

        public String toString() {
            return String.format("%-3d%-15s%10d%10d%10d%10d%10d%10d%10d%10d",
                    position, team, matchesPlayed, wins, draws, losses,
                    runsFor, runsAgainst, runDifference, points);
        }

        public int compareTo(CricketTeam ct) {
            return ((Integer) points).compareTo(ct.points);
        }

        public int getPosition() {
            return position;
        }

        public String getTeam() {
            return team;
        }

        public int getMatchesPlayed() {
            return matchesPlayed;
        }

        public int getWins() {
            return wins;
        }

        public int getDraws() {
            return draws;
        }

        public int getLosses() {
            return losses;
        }

        public int getRunsFor() {
            return runsFor;
        }

        public int getRunsAgainst() {
            return runsAgainst;
        }

        public int getRunDifference() {
            return runDifference;
        }

        public int getPoints() {
            return points;
        }
    }
