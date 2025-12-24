import java.util.Scanner;
public class NumberGuessingGame {

    static Scanner sc = new Scanner(System.in);

    // Method to generate a random guess within range
    public static int generateGuess(int low, int high) {
        return low + (int)(Math.random() * (high - low + 1));
    }

    // Method to get user feedback
    public static char getUserFeedback(int guess) {
        System.out.print("Is the guess " + guess +
                         " too High (H), too Low (L), or Correct (C)? ");
        return sc.next().toUpperCase().charAt(0);
    }

    // Method to update guessing range
    public static int[] updateRange(char feedback, int guess, int low, int high) {

        if (feedback == 'H') {
            high = guess - 1;
        } else if (feedback == 'L') {
            low = guess + 1;
        }

        return new int[]{low, high};
    }

    // Main method
    public static void main(String[] args) {

        int low = 1;
        int high = 100;
        char feedback;
        int attempts = 0;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!\n");

        while (true) {

            int guess = generateGuess(low, high);
            attempts++;

            feedback = getUserFeedback(guess);

            if (feedback == 'C') {
                System.out.println("\n I guessed your number in " +
                                   attempts + " attempts!");
                break;
            }

            int[] range = updateRange(feedback, guess, low, high);
            low = range[0];
            high = range[1];
        }
    }
}
