import java.util.*;
public class CountVowelConsonant{
	
	// methods to check Vowels
	public static boolean checkChar(char a){
		if(a == 'A' || a == 'E' || a == 'O' || a == 'I' || a == 'U'){
			return true;
		}
		else{
			return false;
		}
	}
	
	// Main Method 
	public static void main(String agrs[]){
		
		// Creating Scanner Object
		Scanner input = new Scanner(System.in);
		
		// input string for user
		System.out.print("Enter str : ");
		String ans = input.next();
		
		ans = ans.toUpperCase();
		
		int vowels = 0, couns = 0;
		
		for(int i = 0; i < ans.length(); i++){
			boolean result = CountVowCon.checkChar(ans.charAt(i));
			if(result){
				vowels++;
			}
			else{
				couns++;
			}
		}
		 //Display of Result
		System.out.print(vowels + " " + couns);
		
		//input close
		input.close();
	}
}
