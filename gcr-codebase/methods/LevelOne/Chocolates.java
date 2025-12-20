import java.util.Scanner;
public class Chocolates{

 // Method to find chocaltes and remains
  public static  int[] findRemainderAndQuotient(int number, int divisor){
       int choco= number/divisor;
       int remain=number%divisor;

       return new int[] {choco,remain};
  }

  public static void main(String[] args){
     
     // Creating scanner object
      Scanner sc = new Scanner(System.in);

      // Taking input from user 
      System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the Divisor: ");
        int divisor = sc.nextInt();

        int[] arr= findRemainderAndQuotient(number,divisor) ;

        //output of result

        System.out.println("Each child will get " + arr[0] + " chocolates");
        System.out.println("Remaining chocolates: " + arr[1]);

        sc.close();
    }
	
}