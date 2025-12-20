import java.util.Scanner;
public class TrigonometricFunctions {

    // Method for calculatint trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert degrees to radians
        double radians = Math.toRadians(angle);
        
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        return new double[] { sinValue, cosValue, tanValue };
    }

    public static void main(String[] args) {
       
       // Create Scanner Object
        Scanner sc = new Scanner(System.in);

        // Take input angle in degrees
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Method call
        double[] result = calculateTrigonometricFunctions(angle);

        // Output
        System.out.println("Sine of angle: " + result[0]);
        System.out.println("Cosine of angle: " + result[1]);
        System.out.println("Tangent of angle: " + result[2]);

        sc.close();
    }
}
