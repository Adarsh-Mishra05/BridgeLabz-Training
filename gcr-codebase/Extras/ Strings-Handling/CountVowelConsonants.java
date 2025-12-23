import java.util.*;
public class CountVowelConsonants{
	
	// method to count vowels
	public static int countvowels(String str){
		int result = 0;
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' 
			|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				result += 1;
			}
		}
		return result;
	}

	// method to count consonants
	public static int countconso(String str){
		int result = 0;
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) != 'a' || str.charAt(i) != 'e' 
			|| str.charAt(i) != 'i' || str.charAt(i) != 'o' || str.charAt(i) != 'u'){
				result += 1;
			}
		}
		return result;
	}
	
	// Main Method
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		// input
		System.out.print("Enter str : ");
		String str = input.next();
		
		System.out.print(countvowels(str) + " " + countconso(str));
		
		// scanner close 
		input.close();
	}
	
}
