/**
 * Calculates the average of elements in an array.
 * Time Complexity: O(n) - We iterate through the array once.
 * Space Complexity: O(1) - We use constant extra space.
 */

public class Problem_2 {
    public static double calculateAverage(int n, int[] arr) {
        if (n <= 0) throw new IllegalArgumentException("Array must have at least one element");

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / n;
    }
}

