import java.util.Scanner;
public class FriendsComparison {
    public static void main(String[] args) {
      
       // Creating Scanner Object 
        Scanner sc = new Scanner(System.in);

        // Taking age inputs
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();
     // Taking height inputs
        System.out.print("Enter Amar's height: ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        int heightAnthony = sc.nextInt();


        // Finding youngest friend
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("Amar is the youngest.");
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }


        // Finding tallest friend
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("Amar is the tallest.");
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }

        sc.close();
    }
}
