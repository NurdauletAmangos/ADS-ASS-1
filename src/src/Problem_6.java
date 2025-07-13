/**
 * Calculates a^n using recursion.
 * Time Complexity: O(n) - The recursion depth is proportional to n.
 * Space Complexity: O(n) - The recursion stack uses space proportional to n.
 */

public class Problem_6 {
    public static int power(int a, int n) {
        if (n < 0) throw new IllegalArgumentException("Exponent must be non-negative");
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
}
