public class FootballTeam{

    // Method to find sum of heights
    public static int findSum(int[] height) {
        int sum = 0;
        for (int h : height) {
            sum += h;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] height) {
        int sum = findSum(height);
        return (double) sum / height.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] height) {
        int min = height[0];
        for (int h : height) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }
  

    public static void main(String[] args) {

        // Creating Array for 11 players
        int[] heights = new int[11];

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }

        // Display of heights
        System.out.println("Heights of football players (in cm):");
        for (int h : heights) {
            System.out.print(h + " ");
        }

        // Calling methods Calculations 
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);

        // Display Of Results
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");
        System.out.println("Mean height: " + mean + " cm");
    }
}
