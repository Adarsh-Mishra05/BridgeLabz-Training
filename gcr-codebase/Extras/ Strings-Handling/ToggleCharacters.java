import java.util.Scanner;
public class ToggleCharacters{
	
	// methods to convert string case
	public static String convertString(String str){
		
		String result = "";
		 // Toggle case logic
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Convert uppercase to lowercase and vice-versa
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            }
            else if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            }
            else {
                result += ch;
            }
            return result;
	}
	
	// main method 
	public static void main(String args[]){
		
		//Display of Result
		System.out.print(convertString("ABCDabcd"));
	}
}
