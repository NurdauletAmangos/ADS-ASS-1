
/**
 * Calculates binomial coefficient C(n,k) using recursion.
 * Time Complexity: O(2^n) - Exponential due to the recursive tree.
 * Space Complexity: O(n) - The recursion stack uses space proportional to n.
 */

public class Problem_9 {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}
