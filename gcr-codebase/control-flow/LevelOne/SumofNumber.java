import java.util.Scanner;
public class SumofNumber {
    public static void main(String[] args) {

        // Scanner object to take input
        Scanner sc = new Scanner(System.in);
        // Taking number input 
        int number = sc.nextInt();

        // checking if number is natural
        if(number<0){
            System.out.println("The number "+number + " is not a natural number ")
        }
        else
        { 
        // sum of number 
         int sum= number*(number+1)/2;
         
        // Printing the result
        System.out.println("The sum of " + number + " natural number is " + sum);
        }
        // Closing scanner
        sc.close();

    }
}