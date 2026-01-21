package Week2.FitnessTracker;

	public class FitnessTracker {

	    // Bubble Sort: Descending order by steps
	    static void bubbleSort(String[] users, int[] steps) {
	        int n = steps.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (steps[j] < steps[j + 1]) {

	                    // swap steps
	                    int tempSteps = steps[j];
	                    steps[j] = steps[j + 1];
	                    steps[j + 1] = tempSteps;

	                    // swap corresponding users
	                    String tempUser = users[j];
	                    users[j] = users[j + 1];
	                    users[j + 1] = tempUser;
	                }
	            }
	        }
	    }

	    static void displayLeaderboard(String[] users, int[] steps) {
	        System.out.println("🏆 Daily Step Leaderboard:");
	        for (int i = 0; i < users.length; i++) {
	            System.out.println((i + 1) + ". " + users[i] + " → " + steps[i] + " steps");
	        }
	    }

	    public static void main(String[] args) {

	        String[] users = {"Amit", "Riya", "Karan", "Neha", "Suman"};
	        int[] steps = {8200, 12000, 9500, 7000, 11000};

	        System.out.println("Before Ranking:");
	        displayLeaderboard(users, steps);

	        bubbleSort(users, steps);

	        System.out.println("\nAfter Ranking:");
	        displayLeaderboard(users, steps);
	    }
	}


