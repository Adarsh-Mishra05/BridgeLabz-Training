package Week1.ArtExpo;

public class Main {
	
	    static void insertionSort(int[] regTime) {
	        int n = regTime.length;

	        for (int i = 1; i < n; i++) {
	            int key = regTime[i];
	            int j = i - 1;

	            // Shift larger elements to the right
	            while (j >= 0 && regTime[j] > key) {
	                regTime[j + 1] = regTime[j];
	                j--;
	            }

	            // Insert at correct position
	            regTime[j + 1] = key;
	        }
	    }

	    static void display(int[] regTime) {
	        for (int time : regTime) {
	            System.out.print(time + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] registrationTimes = {90, 120, 150, 110, 130};

	        System.out.println("Before Sorting:");
	        display(registrationTimes);

	        insertionSort(registrationTimes);

	        System.out.println("After Sorting:");
	        display(registrationTimes);
	    }
	}



