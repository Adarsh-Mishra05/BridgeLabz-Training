package Week1.RoboWreHouse;

public class Main {

    // Insertion Sort based on package weight
    static void insertionSort(Package[] shelf) {
        for (int i = 1; i < shelf.length; i++) {
            Package key = shelf[i];
            int j = i - 1;

            // shift heavier packages to the right
            while (j >= 0 && shelf[j].weight > key.weight) {
                shelf[j + 1] = shelf[j];
                j--;
            }

            shelf[j + 1] = key;
        }
    }

    static void display(Package[] shelf) {
        for (Package p : shelf) {
            System.out.print(p.weight + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Package[] shelf = {
            new Package(30),
            new Package(10),
            new Package(25),
            new Package(20)
        };

        System.out.print("Before loading: ");
        display(shelf);

        insertionSort(shelf);

        System.out.print("After loading:  ");
        display(shelf);
    }
}

