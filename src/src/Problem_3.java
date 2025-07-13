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
