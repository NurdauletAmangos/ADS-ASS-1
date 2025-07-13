public class Problem_2 {
    public static double calculateAverage(int n, int[] arr) {
        if (n <= 0) throw new IllegalArgumentException("Array must have at least one element");

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / n;
    }
}