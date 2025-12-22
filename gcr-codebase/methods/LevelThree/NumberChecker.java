import java.util.Scanner;
public class NumberChecker {

    // Method for counting Digits
    public static int countDigits(int number){
       int count = 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
    //Method to store Digits
    public static int[] storeDigits(int num,int count){

          int[] digits =new int[count];
          for(int i=count-1;i>=0;i--){
           digits[i]=num%10;
           num=num/10;
            }
          return digits;

    }

    // Method to check Duck Number
     public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check Armstroong Number
    public static boolean isArmstrong(int number, int[] digits){

        int sum = 0;
        int power = digits.length;

        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }
    // Method to find find Lrgest and sLargest
    public static void findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
    // Method to find smallest and second smallest
    public static void findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
          secondSmallest = smallest;
          smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }

        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + secondSmallest);
    }
    // Main Method

    public static void main(String[] args){
        //Create Scanner Object
         Scanner sc = new Scanner(System.in);
        //taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = storeDigits(number, count);
       
        System.out.println("Digit Count: " + count);

        System.out.print("Digits: ");
        for (int i : digits) {
            System.out.print(i + " ");
        }
        System.out.println();
         
         // Display of Results
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrong(number, digits));
        findLargest(digits);
        findSmallest(digits);

       // Scanner close
        sc.close();

    }
}