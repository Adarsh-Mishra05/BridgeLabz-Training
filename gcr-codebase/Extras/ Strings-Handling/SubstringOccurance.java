import java.util.*;
public class SubstringOccurance{
	
	// Method to count substring
	public static int countSubstring(String str, String substr){
		int count = 0;
		int sublength = substr.length();
		
		for(int i = 0; i <= str.length() - sublength; i++){
			if(str.substring(i,i+sublength).equals(substr)){
				count++;
			}
		}
		
		return count;
	} 
	
	//Main method
	public static void main(String args[]){
		
		//Display of Result
		System.out.print(countSubstring("xvbxyzbjkxyzckxy","xyz"));
	}
}
