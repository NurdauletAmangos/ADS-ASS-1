/**
 * Finds the minimum value in an array of integers.
 * Time Complexity: O(n) - We iterate through the array once.
 * Space Complexity: O(1) - We use constant extra space.
 */

public class Problem_1 {
    public static int findMinimum(int n, int[] arr) {
        if (n <= 0) throw new IllegalArgumentException("Array must have at least one element");

        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

