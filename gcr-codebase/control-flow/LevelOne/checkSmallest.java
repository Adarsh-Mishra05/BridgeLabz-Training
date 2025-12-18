import java.util.Scanner;
public class checkSmallest {
    public static void main(String[] args) {

        // Scanner object to take input
        Scanner sc = new Scanner(System.in);
        // Taking num1,num2,num3 input 
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3= sc.nextInt();

        // Checking condition
        boolean checker = (num1<num2 && num1<num3);

        // Printing the result
        System.out.println(" Is the first number the smallest?" + checker);
   
        // Closing scanner
        sc.close();
    }
}
