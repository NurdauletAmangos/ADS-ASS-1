
/**
 * Finds the nth Fibonacci number using recursion.
 * Time Complexity: O(2^n) - Exponential due to the recursive tree.
 * Space Complexity: O(n) - The recursion stack uses space proportional to n.
 */

public class Problem_5 {
    public static int fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("Fibonacci is not defined for negative numbers");
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
