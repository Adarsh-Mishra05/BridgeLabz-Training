import java.util.Scanner;
public class UnitConvertor {

    // Convert kilometers to miles
    public static double KmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Convert miles to kilometers
    public static double MilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Convert meters to feet
    public static double MetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Convert feet to meters
    public static double FeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // main method 
    public static void main(String[] args) {
       
       // Creating Scanner object.
       Scanner sc= new Scanner(System.in);
       // Taking  input User 
       int n= sc.nextInt();
        
        // Display of Result
        System.out.println(n +" km in miles = " + KmToMiles(n));
        System.out.println(n+ " miles in km = " + MilesToKm(n));
        System.out.println(n+ " meters in feet = " + MetersToFeet(n));
        System.out.println(n+ " feet in meters = " + FeetToMeters(n));

      // Display of Result
        sc.close();
    }

}
