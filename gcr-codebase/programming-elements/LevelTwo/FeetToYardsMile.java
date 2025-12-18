import java.util.Scanner;

public class FeetToYardsMile{
    public static void main(String[] args) {

        // Create Scanner object 
        Scanner input = new Scanner(System.in);

        // Take distance in feet 
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversion logic
        
        double yards = distanceInFeet / 3;

        // 1 mile = 1760 yards
        double miles = yards / 1760;

        // Display the result
        System.out.println(
            "The distance in yards is " + yards +
            " while the distance in miles is " + miles
        );

        
        input.close();
    }
}
