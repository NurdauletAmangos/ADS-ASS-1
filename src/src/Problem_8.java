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
