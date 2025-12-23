import java.util.*;
public class FindLength{
	
	// method 
	public static int returnlength(String str){
		int result = 0, i = 0;
		while(true){
			try{
				str.charAt(i);
			}
			catch(Exception e){
				break;
			}
			i += 1;
			result += 1;
		}
		return result;
	}
	
	//  main method 
	public static void main(String args[]){
		
		// Creating scanner object
		Scanner sc = new Scanner(System.in);
		
		// input of String
		System.out.print("Enter str : ");
		String str = sc.next();
		
		// method calling
		
		System.out.println(returnlength(str));
		
		System.out.print(returnlength(str) == str.length());
		
		// closing  scanner
		sc.close();
	}
}
