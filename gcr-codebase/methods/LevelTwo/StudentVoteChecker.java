import java.util.Scanner;
public class StudentVoteChecker {

    // Method to check student can vote or not
    public boolean canStudentVote(int age) {

        // Check negative age
        if (age < 0) {
            return false;
        }

        // Check voting eligibility
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        
        // Creating Scanner Object
        Scanner sc = new Scanner(System.in);
        
         // Creating object of VoteChecker
        StudentVoteChecker checker = new StudentVoteChecker();
        // Array to store ages 
        int[] ages = new int[10];

        // Taking input and checking voting eligibility
        for (int i = 0; i < ages.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            boolean canVote = canStudentVote(ages[i]);

           // Display Of Result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote.");
            }
        }

        // Scanner Close
        sc.close();
    }
}
