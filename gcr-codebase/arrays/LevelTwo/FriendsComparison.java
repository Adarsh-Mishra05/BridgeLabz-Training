import java.util.Scanner;
public class FriendsComparison {
    public static void main(String[] args) {

        // Creating Scanner Object 
        Scanner sc = new Scanner(System.in);

        // Names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store age and height
        int[] age = new int[3];
        double[] height = new double[3];

        // Take input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            height[i] = sc.nextDouble();
        }

        // Initialize youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find youngest and tallest
        for (int i = 1; i < 3; i++) {

            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display result
        System.out.println("\nYoungest Friend: " + names[youngestIndex]);
        System.out.println("Tallest Friend: " + names[tallestIndex]);

        sc.close();
    }
}
