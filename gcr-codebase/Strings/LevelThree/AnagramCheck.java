import java.util.Scanner;
public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean isAnagram(String text1, String text2) {

        // Remove spaces and convert to lowercase
        text1 = text1.replace(" ", "").toLowerCase();
        text2 = text2.replace(" ", "").toLowerCase();

        //  Check length
        if (text1.length() != text2.length()) {
            return false;
        }

        //  Create frequency arrays 
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        //  Find frequency of characters
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i) - 'a']++;
            freq2[text2.charAt(i) - 'a']++;
        }

        // Compare frequency arrays
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        //  All frequencies matched
        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // Call method and display result
        if (isAnagram(text1, text2)) {
            System.out.println("The given texts are ANAGRAMS");
        } else {
            System.out.println("The given texts are NOT anagrams");
        }
     
     // scanner
        sc.close();
    }
}
