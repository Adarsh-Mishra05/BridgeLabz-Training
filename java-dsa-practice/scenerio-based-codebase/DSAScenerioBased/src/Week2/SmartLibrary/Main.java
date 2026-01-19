package Week2.SmartLibrary;

public class Main {
     public static void main(String[] args) {
        String[] borrowedBooks = {
            "Algorithms",
            "Data Structures",
            "Java Programming",
            "Python Basics",
            "Computer Networks"
        };

        System.out.println("Before Sorting:");
        Sorting.display(borrowedBooks);

        Sorting.insertionSort(borrowedBooks);

        System.out.println("\nAfter Auto-Sorting:");
        Sorting.display(borrowedBooks);
    }
}

