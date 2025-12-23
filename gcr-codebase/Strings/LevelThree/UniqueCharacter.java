import java.util.Scanner;
public class UniqueCharacter{
	  
	  public static int findLength(String str){
       
       int cnt=0;
        try{
          while(true){
          str.charAt(cnt);
          cnt++;    
        }
       }
        catch(Exception e){
           
        }
        return cnt;

	  }

	  // Method to find unique characters 
    public static char[] findUniqueCharacters(String text) {

        int length = findLength(text);

        // Array to store unique characters 
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (currentChar == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If character is unique, store it
            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create new array of exact size for unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

	 public static void main(String[] args){
	   Scanner sc= new Scanner(System.in);

	   // input string for user
		System.out.print("Enter str : ");
		String ans = sc.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(ans);

        // Display result
        System.out.println("Unique Characters:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        sc.close();
	 
     }
}