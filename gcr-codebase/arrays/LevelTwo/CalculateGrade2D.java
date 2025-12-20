import java.util.Scanner;
public class CalculateGrade2D{
    public static void main(String args[]){


        // Creating Scanner Object 
        Scanner sc = new Scanner(System.in);

        // Take number of Student as input
        System.out.print("Enter a number of Student: ");
        int number = sc.nextInt();

        int[][] marks= new int[number][3];
        double [] percent= new double[number];
        char[] grade= new char[number];

       
        for(int i=0;i<n;i++){
           System.out.println(" Enter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) {
                 System.out.println(" Enter Valid Marks ")
                    i--;
                    break;
                }
            }
            // Percentage Calculation 
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Providing Grades
             if (percentage[i] >= 80)
                grade[i] = 'A';
              else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
           else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }
        //Displaying Results
        System.out.println(" Student Result--");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " | Percentage: " + percentage[i] +
                    " | Grade: " + grade[i]);
        }
 // Scanner close
        sc.close();

    }  
}