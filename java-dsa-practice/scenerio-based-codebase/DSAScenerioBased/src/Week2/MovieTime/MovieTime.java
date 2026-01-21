package Week2.MovieTime;

public class MovieTime {
	static void insertionSort(int[] times) {
        for (int i = 1; i < times.length; i++) {
            int key = times[i];
            int j = i - 1;

            while (j >= 0 && times[j] > key) {
                times[j + 1] = times[j];
                j--;
            }
            times[j + 1] = key;
        }
    }

    static void display(int[] times) {
        for (int t : times) {
            int hr = t / 60;
            int min = t % 60;
            System.out.printf("%02d:%02d ", hr, min);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] showTimes = {
            600, // 10:00
            660, // 11:00
            720, // 12:00
            690  // 11:30 
        };

        System.out.println("Before Sorting:");
        display(showTimes);

        insertionSort(showTimes);

        System.out.println("After Sorting:");
        display(showTimes);
    }

}
