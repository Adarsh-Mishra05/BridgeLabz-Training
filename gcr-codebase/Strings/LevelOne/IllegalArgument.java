import java.util.*;
public class IllegalArgument{
	
	// methods  to generate Exception
	public static void generateException(String str){
		
		System.out.print(str.substring(5,3));
	}
	
	public static void handlingException(String str){
		
		try{
			System.out.print(str.substring(5,1));
		}
		catch(IllegalArgumentException e){
			System.out.print(e);
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
	// main methods 
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		// Input the string
		System.out.print("Enter str : ");
		String str = input.next();

		//Method to generate exception
		generateException(str);
		// method calling to handle exception 
		handlingException(str);
		
		// scanner close
		sc.close();
	}
}