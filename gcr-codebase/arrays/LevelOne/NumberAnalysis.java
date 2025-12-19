import java.util.Scanner;
public class NumberAnalysis{
	public static void main(String[] args){

	 // Creating Scanner object
     Scanner sc = new Scanner(System.in);

        // Define array of size 5
        int[] arr = new int[5];

        // Take input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Check each number
        System.out.println("\nNumber Analysis:");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is Positive and Even");
                } else {
                    System.out.println(arr[i] + " is Positive and Odd");
                }
            } 
            else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            } 
            else {
                System.out.println(arr[i] + " is Zero");
            }
        }

        // Compare first and last elements
        System.out.println("\nComparison of first and last elements:");
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and last elements are Equal");
        } 
        else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is Greater than last element");
        } 
        else {
            System.out.println("First element is Less than last element");
        }

        sc.close();
    }

	
}