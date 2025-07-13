/**
 * Checks if a string consists only of digits.
 * Time Complexity: O(n) - We check each character once.
 * Space Complexity: O(1) - We use constant extra space.
 */

public class Problem_8 {
    public static String isAllDigits(String s) {
        if (s == null || s.isEmpty()) return "No";

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return "No";
            }
        }
        return "Yes";
    }
}

