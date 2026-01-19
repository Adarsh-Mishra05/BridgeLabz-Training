package Week1.CinemaHouse;

class Main {

    // Bubble Sort function
    static void bubbleSort(int[] showTimes) {
        int n = showTimes.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (showTimes[j] > showTimes[j + 1]) {
                    int temp = showTimes[j];
                    showTimes[j] = showTimes[j + 1];
                    showTimes[j + 1] = temp;
                }
            }
        }
    }

    // Display function
    static void display(int[] showTimes) {
        for (int time : showTimes) {
            int hours = time / 60;
            int minutes = time % 60;
            System.out.printf("%02d:%02d ", hours, minutes);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] showTimes = {
            630, // 10:30
            555, // 09:15
            720, // 12:00
            660, // 11:00
            840  // 14:00
        };

        System.out.println("Before Sorting:");
        display(showTimes);

        bubbleSort(showTimes);

        System.out.println("After Sorting:");
        display(showTimes);
    }
}

