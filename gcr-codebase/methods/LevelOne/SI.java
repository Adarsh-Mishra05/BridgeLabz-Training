import java.util.Scanner;

public class SI{

    // Method to calculate Simple Interest
    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        // Method call
        double si = calculateSI(principal, rate, time);

        // Displaying the Output
        System.out.println(
            "The Simple Interest is " + si +
            " for Principal " + principal +
            ", Rate of Interest " + rate +
            " and Time " + time
        );
     // Scanner close
        sc.close();
    }
}
