public class Main {
    public static void main(String[] args) {
        // Problem 1 Demo
        int[] arr1 = {10, 1, 32, 3, 45};
        System.out.println("Problem 1 - Minimum: " + Problem_1.findMinimum(5, arr1));

        // Problem 2 Demo
        int[] arr2 = {3, 2, 4, 1};
        System.out.println("Problem 2 - Average: " + Problem_2.calculateAverage(4, arr2));

        // Problem 3 Demo
        System.out.println("Problem 3 - 7 is: " + Problem_3.checkPrime(7));
        System.out.println("Problem 3 - 10 is: " + Problem_3.checkPrime(10));

        // Problem 4 Demo
        System.out.println("Problem 4 - 5! = " + Problem_4.factorial(5));

        // Problem 5 Demo
        System.out.println("Problem 5 - Fibonacci(5) = " + Problem_5.fibonacci(5));
        System.out.println("Problem 5 - Fibonacci(17) = " + Problem_5.fibonacci(17));

        // Problem 6 Demo
        System.out.println("Problem 6 - 2^10 = " + Problem_6.power(2, 10));

        // Problem 7 Demo
        String[] arr7 = {"1", "4", "6", "2"};
        System.out.print("Problem 7 - Original: ");
        for (String s : arr7) System.out.print(s + " ");
        Problem_7.reverseArray(4, arr7, 0);
        System.out.print("\nReversed: ");
        for (String s : arr7) System.out.print(s + " ");
        System.out.println();

        // Problem 8 Demo
        System.out.println("Problem 8 - '123456': " + Problem_8.isAllDigits("123456"));
        System.out.println("Problem 8 - '123a12': " + Problem_8.isAllDigits("123a12"));

        // Problem 9 Demo
        System.out.println("Problem 9 - C(2,1) = " + Problem_9.binomialCoefficient(2, 1));
        System.out.println("Problem 9 - C(7,3) = " + Problem_9.binomialCoefficient(7, 3));

        // Problem 10 Demo
        System.out.println("Problem 10 - GCD(32,48) = " + Problem_10.gcd(32, 48));
        System.out.println("Problem 10 - GCD(10,7) = " + Problem_10.gcd(10, 7));
    }
}