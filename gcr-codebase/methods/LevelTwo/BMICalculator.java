import java.util.Scanner;
public class BMICalculator {

    // Method for calculating BMI 
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            // convert cm to meter
            double heightM = heightCm / 100; 

            data[i][2] = weight / (heightM * heightM);
        }
    }

    // Method to show BMI status
    public static String BMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    
    // Main function
    public static void main(String[] args) {

    // Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        // Creating 2D array
        double[][] persons = new double[10][3];

        // Input weight and height
        for (int i = 0; i < persons.length; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();
        }

        // Calculate BMI 
        calculateBMI(persons);

        // Display of result
        System.out.println("BMI REPORT ");
        for (int i = 0; i < persons.length; i++) {
         double bmi = persons[i][2];
            System.out.printf(
                 System.out.println("Person " + (i + 1));
                 System.out.println("Weight: " + persons[i][0] + " kg");
                 System.out.println("Height: " + persons[i][1] + " cm");
                 System.out.println("BMI: " + persons[i][2]);
                 System.out.println("Status : " + getBMIStatus(persons[i][2]));
                 System.out.println();
            );
        }
        
        // Scanner Close
        sc.close();
    }
}
