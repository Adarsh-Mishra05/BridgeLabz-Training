import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
    
    // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        // Array to store heights of 11 players
        double[] heights = new double[11];
        double sum = 0.0;

        // Take input for heights
        System.out.println("Enter heights of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        // Calculate mean height
        double mean = sum / heights.length;

        // Display result
        System.out.println("\nMean height of the football team = " + mean);

        sc.close();
    }
}
