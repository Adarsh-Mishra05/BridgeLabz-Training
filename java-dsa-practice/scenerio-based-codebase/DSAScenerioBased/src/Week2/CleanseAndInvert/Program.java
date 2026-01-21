package Week2.CleanseAndInvert;
import java.util.*;

 

public class Program {
	public static String CleanseandInvert(String s) {
		String ans="";
		if(s.length()<6 || s==null) return ans;
		
		boolean st=true;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='A' && c<='Z' || c>='a' && c<='z') {
				st=true;
			}
			else { 
				st=false;
				return ans ;
			}
			
		}
		String str= s.toLowerCase();
		String newStr="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			int ascii=c;
			if(ascii%2!=0) {
				newStr= newStr + c;
				
			}
		}
		
		// Reversing the Chars...
		String RevString="";
		for(int i=0;i<newStr.length();i++) {
			RevString= newStr.charAt(i) + RevString;
			
		}
		
		// replacing even place with upper
		
		String FinalString="";
		for(int i=0;i<RevString.length();i++) {
			char c= (char) (RevString.charAt(i)-32);
			if(i%2==0) {
				FinalString= FinalString + c;
			}
			else FinalString+= RevString.charAt(i);
			
		}
		
		return FinalString;
		
	 }

	
	public static void main(String args[]) {
		
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println( "Enter the Word :" ) ;
	String s= sc.nextLine();
	s=CleanseandInvert(s);
	if(!s.isEmpty()) {
		System.out.println("The Generated Key is : ");
		System.out.println(s);
		
	}
	else {
		System.out.println("Invalid Input!");
	}
	
	}

}
