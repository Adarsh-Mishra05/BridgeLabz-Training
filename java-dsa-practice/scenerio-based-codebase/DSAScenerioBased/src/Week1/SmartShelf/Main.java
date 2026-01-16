package Week1.SmartShelf;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

public class Main{

    // Insertion Sort by Book Title (A → Z)
    static void insertionSort(Book[] books) {
        int n = books.length;

        for (int i = 1; i < n; i++) {
            Book key = books[i];
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && books[j].title.compareTo(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            // Insert book at correct position
            books[j + 1] = key;
        }
    }

    static void display(Book[] books) {
        for (Book b : books) {
            System.out.println(b.title);
        }
    }

    public static void main(String[] args) {

        Book[] shelf = {
            new Book("Algorithms"),
            new Book("Data Structures"),
            new Book("Java Programming"),
            new Book("Artificial Intelligence")
        };

        System.out.println("Before Sorting:");
        display(shelf);

        insertionSort(shelf);

        System.out.println("\nAfter Sorting (Alphabetical Order):");
        display(shelf);
    }
}

