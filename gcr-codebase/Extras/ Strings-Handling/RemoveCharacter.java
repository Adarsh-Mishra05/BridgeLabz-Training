import java.util.Scanner;
public class RemoveCharacter {
    public static void main(String[] args) {
      
      // Creating Scanner class 
        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Take character to remove
        System.out.print("Enter character to remove: ");
        char removeChar = sc.next();

        String result = "";

        // Logic to remove character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != removeChar) {
                result += str.charAt(i);
            }
        }

        // Display of result
        System.out.println("Resulting String: " + result);
       
       // scanner close
        sc.close();
    }
}
