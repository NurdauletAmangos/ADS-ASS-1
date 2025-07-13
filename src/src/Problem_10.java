/**
 * Finds GCD of two numbers using Euclidean algorithm (recursive).
 * Time Complexity: O(log(min(a,b))) - The algorithm reduces the problem size exponentially.
 * Space Complexity: O(log(min(a,b))) - The recursion stack uses space proportional to the number of steps.
 */

public class Problem_10 {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

