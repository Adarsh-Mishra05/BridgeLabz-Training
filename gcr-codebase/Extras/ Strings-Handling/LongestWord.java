import java.util.*;
public class LongestWord{
	
	// convert strings to words array 
	public static String[] toString(String str){
		return str.split(" ");
	}

	// Methods to find Longest word
	public static String findLongest(String str){

		String[] words= tostring(str);
		String maxi= words[0];
		for(int i=0;i<words.length;i++){
          if(words[i].length()>maxi.length()){
          	maxi= words[i];
          } 
		}
		return maxi;
		
	}
	//Main method 
	public static void main(String args[]){
		//Creating scanner object 
		Scanner input = new Scanner(System.in);
		
		// input of string 
		System.out.print("Enter str : ");
		String ans = input.nextLine();
		
		System.out.print(findLongest(ans));
		
		//scanner close 
		input.close();
	}
	
}
