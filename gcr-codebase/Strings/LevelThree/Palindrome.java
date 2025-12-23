import java.util.Scanner;

public class PalindromeCheck {

    // Using start & end index (Iterative) --------
    public static boolean isPalindromeIterative(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Using Recursion --------
    public static boolean isPalindromeRecursive(String text, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    //  Helper Method: Reverse string
    public static char[] reverseString(String text) {

        int length = text.length();
        char[] reverse = new char[length];

        int index = 0;
        for (int i = length - 1; i >= 0; i--) {
            reverse[index] = text.charAt(i);
            index++;
        }

        return reverse;
    }

    // Using Character Arrays 
    public static boolean isPalindromeUsingArray(String text) {

        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    // Main Method --------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Logic 1
        boolean result1 = isPalindromeIterative(input);

        // Logic 2
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);

        // Logic 3
        boolean result3 = isPalindromeUsingArray(input);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Iterative) : " + result1);
        System.out.println("Logic 2 (Recursive) : " + result2);
        System.out.println("Logic 3 (Array)     : " + result3);

        sc.close();
    }
}
