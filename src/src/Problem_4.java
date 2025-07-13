
/**
 * Calculates factorial of a number using recursion.
 * Time Complexity: O(n) - The recursion depth is proportional to n.
 * Space Complexity: O(n) - The recursion stack uses space proportional to n.
 */
public class Problem_4 {
    public static int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}

