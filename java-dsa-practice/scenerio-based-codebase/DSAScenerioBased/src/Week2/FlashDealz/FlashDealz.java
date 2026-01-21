package Week2.FlashDealz;

public class FlashDealz {
	 static void quickSort(Product[] arr, int low, int high) {
	        if (low < high) {
	            int p = partition(arr, low, high);
	            quickSort(arr, low, p - 1);
	            quickSort(arr, p + 1, high);
	        }
	    }

	    static int partition(Product[] arr, int low, int high) {
	        int pivot = arr[high].discount;
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (arr[j].discount > pivot) {
	                i++;
	                Product temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        Product temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }

	    static void display(Product[] arr) {
	        for (Product p : arr) {
	            System.out.println(p.name + " → " + p.discount + "% OFF");
	        }
	    }

	    public static void main(String[] args) {

	        Product[] products = {
	            new Product("Laptop", 80),
	            new Product("Shoes", 40),
	            new Product("TV", 70),
	            new Product("Watch", 30),
	            new Product("Phone", 90)
	        };

	        System.out.println("Before Sorting:");
	        display(products);

	        quickSort(products, 0, products.length - 1);

	        System.out.println("\nAfter Sorting (Top Discounts First):");
	        display(products);
	    }

}
