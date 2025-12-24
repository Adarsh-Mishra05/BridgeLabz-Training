import java.util.Scanner;
public class MostFrequentChar{
	 
	// method to find most freq
	public static char findMostFreq(String name){
		
		int[] freq = new int[256];
		
		for(int i = 0; i < name.length(); i++){
			freq[name.charAt(i)]++;
		}
		int max = freq[0];
		char maxchar = name.charAt(0);
		
		for(int i = 0; i < freq.length; i++){
			if(freq[i] > max){
				max = freq[i];
				maxchar = (char)i;
			}
		}
		
		return maxchar;
	}
	// main method
	public static void main(String args[]){
		
		//Display of Result
		System.out.print(findMostFreq("ababababckansdhouad"));
		
	}
}
