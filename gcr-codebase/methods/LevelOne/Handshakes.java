import java.util.Scanner;
public class Handshakes {

    // Method to calculate maximum handshakes
    static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Method call
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display output
        System.out.println("Maximum number of possible handshakes: " + handshakes);

        sc.close();
    }
}
