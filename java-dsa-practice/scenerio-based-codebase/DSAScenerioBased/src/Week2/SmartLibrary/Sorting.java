package Week2.SmartLibrary;

public class Sorting {
	static void insertionSort(String[] books) {
        int n = books.length;

        for (int i = 1; i < n; i++) {
            String key = books[i];
            int j = i - 1;

            // Shift books that come after key alphabetically
            while (j >= 0 && books[j].compareTo(key) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            // Insert book at correct position
            books[j + 1] = key;
        }
    }


    static void display(String[] books) {
        for (String book : books) {
            System.out.println(book);
        }
    }


}
