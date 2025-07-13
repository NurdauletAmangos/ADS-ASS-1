/**
 * Reverses an array using recursion without additional array structure.
 * Time Complexity: O(n) - We process each element once.
 * Space Complexity: O(n) - The recursion stack uses space proportional to n.
 */

public class Problem_7 {
    public static void reverseArray(int n, String[] elements, int index) {
        if (index >= n / 2) return;

        // Swap elements
        String temp = elements[index];
        elements[index] = elements[n - index - 1];
        elements[n - index - 1] = temp;

        reverseArray(n, elements, index + 1);
    }
}

