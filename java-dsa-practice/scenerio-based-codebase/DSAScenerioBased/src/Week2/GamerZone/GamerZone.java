package Week2.GamerZone;

public class GamerZone {

    // Quick Sort (Descending by score)
    static void quickSort(String[] players, int[] scores, int low, int high) {
        if (low < high) {
            int p = partition(players, scores, low, high);
            quickSort(players, scores, low, p - 1);
            quickSort(players, scores, p + 1, high);
        }
    }

    static int partition(String[] players, int[] scores, int low, int high) {
        int pivot = scores[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (scores[j] > pivot) {   // DESC order
                i++;

                // swap scores
                int tempScore = scores[i];
                scores[i] = scores[j];
                scores[j] = tempScore;

                // swap players
                String tempPlayer = players[i];
                players[i] = players[j];
                players[j] = tempPlayer;
            }
        }

        // final pivot swap
        int tempScore = scores[i + 1];
        scores[i + 1] = scores[high];
        scores[high] = tempScore;

        String tempPlayer = players[i + 1];
        players[i + 1] = players[high];
        players[high] = tempPlayer;

        return i + 1;
    }

    static void display(String[] players, int[] scores) {
        System.out.println("🏆 Live Leaderboard:");
        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + ". " + players[i] + " → " + scores[i]);
        }
    }

    public static void main(String[] args) {

        String[] players = {"Neo", "Alex", "Riya", "Zane", "Maya"};
        int[] scores = {1200, 4500, 3000, 5200, 4100};

        System.out.println("Before Ranking:");
        display(players, scores);

        quickSort(players, scores, 0, scores.length - 1);

        System.out.println("\nAfter Ranking:");
        display(players, scores);
    }
}

