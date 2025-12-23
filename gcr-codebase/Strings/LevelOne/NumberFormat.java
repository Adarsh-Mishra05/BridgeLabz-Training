import java.util.*;
public class NumberFormat{
	
	// method to generate Exception
	public static void generateException(String str){
		System.out.print(Integer.parseInt(str));
	}
	
	public static void handlingExcption(String str){
		
		try{
			System.out.print(Integer.parseInt(str));
		}
		catch(NumberFormatException e){
			System.out.print(e);
		}
		catch(Exception e){
			System.out.print(e);
		}
	}
	
	// main method 
	public static void main(String agrs[]){
		
		Scanner sc = new Scanner(System.in);
		
		// taking input 
		System.out.print("Enter str : ");
		String str = sc.next();
		
		// method to generate exception
		NumberFormat.generateException(str);
		NumberFormat.handlingExcption(str);
		//scanner close 
		sc.close();
	}
}
