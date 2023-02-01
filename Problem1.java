import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {

        String[][] arr =
                { {"Germany",  "2", "Scotland", "1"},
                        {"Poland",   "2", "Germany",  "0"},
                        {"Germany",  "1", "Ireland",  "1"},
                        {"Poland",   "2", "Scotland", "2"},
                        {"Scotland", "1", "Ireland",  "0"},
                        {"Ireland",  "1", "Poland",   "1"},
                        {"Ireland",  "1", "Scotland", "1"},
                        {"Germany",  "3", "Poland",   "1"},
                        {"Scotland", "2", "Germany",  "3"},
                        {"Ireland",  "1", "Germany",  "0"},
                        {"Scotland", "2", "Poland",   "2"},
                        {"Poland",   "2", "Ireland",  "1"} };

        int[] scores = new int[4];

        for (String[] match : arr){
            int team1Index = getTeamIndex(match[0]);
            int team2Index = getTeamIndex(match[2]);
            int team1Score = Integer.parseInt(match[1]);
            int team2Score = Integer.parseInt(match[3]);

            if (team1Score > team2Score) {
                scores[team1Index] += 3;
            } else if (team1Score == team2Score) {
                scores[team1Index] += 1;
                scores[team2Index] += 1;
            } else {
                scores[team2Index] += 3;
            }
        }

        System.out.println(Arrays.toString(scores));

    }

    public static int getTeamIndex(String team){
        switch (team){
            case "Germany":
                return 0;
            case "Ireland":
                return 1;
            case "Poland":
                return 2;
            case "Scotland":
                return 3;
            default:
                return -1;
        }
    }
}
