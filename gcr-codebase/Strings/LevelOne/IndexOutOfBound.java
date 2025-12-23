import java.util.*;
public class IndexOutOfBound{
	
	// method to genrate Exception
	public static void generateException(String arr[]){
		int i = arr.length + 2;
		System.out.print(arr[i]);
	}
	
	public static void handlingException(String arr[]){
		try{
			System.out.print(arr[arr.length + 2]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.print(e);
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
	// Main method
	public static void main(String args[]){
		
		 Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a String: ");
        String input = sc.nextLine();
		
		// calling methods 
		generateException(input);
		handlingException(input);

		sc.close();
		
	}
}
