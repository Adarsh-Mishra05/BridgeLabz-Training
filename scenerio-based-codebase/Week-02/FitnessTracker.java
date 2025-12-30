import java.util.Scanner;
public class FitnessTracker {
    public static void main(String[] args) {
       // int[] pushUps = {30, 40, 0, 50, 20, 0, 60};
        Scanner sc= new Scanner(System.in);
         int[] pushUps= new int[7];
        for(int i=0;i<7;i++){
        System.out.println("Enter Day "+(i+1)+ " Push-Up Count :");
          pushUps[i]=sc.nextInt();
        }

        int total = 0;
        int workoutDays = 0;

        // for-each loop
        for (int count : pushUps) {

            if (count == 0) {
                continue; // Skip rest day
            }

            total += count;
            workoutDays++;
        }

        double average = (double) total / workoutDays;

        System.out.println("Total Push-ups in a Week: " + total);
        System.out.println("Average Push-ups per Workout Day: " + average);
    }
}
