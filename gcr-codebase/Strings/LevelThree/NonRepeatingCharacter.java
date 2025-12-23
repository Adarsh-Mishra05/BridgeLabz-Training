import java.util.Scanner;
public class NonRepeatingCharacter {

    // Method to find First Non Repeating
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256]; // ASCII frequency array

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Find first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; 
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Minute safety check
        if (input.length() == 0) {
            System.out.println("Empty string entered");
            sc.close();
            return;
        }

        char result = findFirstNonRepeating(input);
       
       // Display of Result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }

        // Scanner close
        sc.close();
    }
}
