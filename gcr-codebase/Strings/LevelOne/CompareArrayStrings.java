import java.util.Scanner;
public class CompareArrayStrings {

    // Method to converts a String into a character array 
    public static char[] characterReturn(String str1) {
        int size = str1.length();
        char[] strArray = new char[size];

        // Copy each character from string to array
        for (int i = 0; i < size; i++) {
            strArray[i] = str1.charAt(i);
        }
        return strArray;
    }

    // This method compares two character arrays
    public static boolean compareSubStrings(char[] stringArray, char[] resultArray) {

        // Safety check: if lengths are different, arrays are not equal
        if (stringArray.length != resultArray.length) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < resultArray.length; i++) {
            if (stringArray[i] != resultArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       
       //Creating Scanner object
        Scanner input = new Scanner(System.in);

        String str1;
        char[] stringArray;
        char[] resultArray;

        // Taking input string
        System.out.print("Enter String : ");
        str1 = input.nextLine(); 
        stringArray = str1.toCharArray();
        resultArray = characterReturn(str1);

        // Compare both arrays
        boolean result = compareSubStrings(stringArray, resultArray);

        // Display result
        if (result) {
            System.out.println("Both the Substrings Arrays are equal");
        } else {
            System.out.println("Both the Substrings Arrays are not equal");
        }

        // Close scanner
        input.close();
    }
}
