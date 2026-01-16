package Week1.SalesReport;

public class Main {
	public static void main(String[] args) {

        Sale[] sales = {
            new Sale("2026-01-10", 1200),
            new Sale("2026-01-08", 500),
            new Sale("2026-01-10", 800),
            new Sale("2026-01-09", 300)
        };

        System.out.println("Before Sorting:");
        for (Sale s : sales) {
            System.out.println(s);
        }

        MergeSorter.mergeSort(sales, 0, sales.length - 1);

        System.out.println("\nAfter Sorting (Date → Amount):");
        for (Sale s : sales) {
            System.out.println(s);
        }
    }

}
