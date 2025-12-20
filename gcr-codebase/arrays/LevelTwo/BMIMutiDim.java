import java.util.Scanner;
public class BMIMutiDim{
    public static void main(String[] args) {

     // Creating Scanner Objects
        Scanner sc = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Create multi-dimensional array and status array
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Take input for weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details of Person " + (i + 1));

            System.out.print("Weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Height (meters): ");
            personData[i][1] = sc.nextDouble();

            // Calculate BMI
            personData[i][2] = personData[i][0] /
                               (personData[i][1] * personData[i][1]);

            // Determine weight status
            if (personData[i][2] <= 18.4)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9)
                weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Display the results
        System.out.println("BMI Report");
        for (int i = 0; i < number; i++) {
            System.out.println(
                "Person " + (i + 1) +
                " | Height: " + personData[i][1] +
                " m | Weight: " + personData[i][0] +
                " kg | BMI: " + personData[i][2] +
                " | Status: " + weightStatus[i]
            );
        }

        sc.close();
    }
}
