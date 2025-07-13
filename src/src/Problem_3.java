/**
 * Checks if a number is prime.
 * Time Complexity: O(√n) - We check divisors up to the square root of n.
 * Space Complexity: O(1) - We use constant extra space.
 */

public class Problem_3 {
    public static String checkPrime(int n) {
        if (n <= 1) return "Composite";

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return "Composite";
            }
        }
        return "Prime";
    }
}

