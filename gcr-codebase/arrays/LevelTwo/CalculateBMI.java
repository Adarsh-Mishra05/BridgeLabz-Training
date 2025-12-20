import java.util.Scanner;
public class CalculateBMI {
    public static void main(String[] args) {


       // Creating Scanner Object 
        Scanner sc = new Scanner(System.in);
      
      // Taking number of students input 
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
      

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
      
      // Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Person " + (i + 1));

            System.out.print("Weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Height (meters): ");
            height[i] = sc.nextDouble();

            //  Calculate BMI
            bmi[i] = weight[i] / (height[i] * height[i]);

            //  Find weight status using table
            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
         // Display the result
        System.out.println("\n----- BMI Report -----");
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Person " + (i + 1) +
                " | Height: " + height[i] +
                " m | Weight: " + weight[i] +
                " kg | BMI: " + bmi[i] +
                " | Status: " + status[i]
            );
        }
   // Scanner close 
        sc.close();
    }
}