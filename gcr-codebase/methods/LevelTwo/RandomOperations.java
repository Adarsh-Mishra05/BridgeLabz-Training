public class RandomOperations {
    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {

        int[] arr = new int[size];

       for (int i = 0; i < size; i++) {
            // generates numbers between 1000 and 9999
            arr[i] = (int)(Math.random() * 9000) + 1000;
        }

        return arr;
    }

    // Method to find ave, minimum and maximum
    public static double[] findAverageMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
             sum += numbers[i];
         min = Math.min(min, numbers[i]);
             max = Math.max(max, numbers[i]);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
    
    // Main function
    public static void main(String[] args) {

        // Generating 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        System.out.println("Generated 4-digit numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        // Find average, min and max
        double[] result = findAverageMinMax(randomNumbers);

       // Display of Result
        System.out.println("Average value: " + result[0]);
      System.out.println("Minimum value: " + result[1]);
        System.out.println("Maximum value: " + result[2]);
    }
}
