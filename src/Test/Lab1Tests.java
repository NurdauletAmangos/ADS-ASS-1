import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Lab1Tests {
    @Test
    void testProblem1() {
        int[] arr = {10, 1, 32, 3, 45};
        assertEquals(1, Problem1.findMinimum(5, arr));
    }

    @Test
    void testProblem2() {
        int[] arr = {3, 2, 4, 1};
        assertEquals(2.5, Problem2.calculateAverage(4, arr));
    }

    @Test
    void testProblem3() {
        assertEquals("Prime", Problem3.checkPrime(7));
        assertEquals("Composite", Problem3.checkPrime(10));
    }

    @Test
    void testProblem4() {
        assertEquals(120, Problem4.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> Problem4.factorial(-1));
    }

    @Test
    void testProblem5() {
        assertEquals(5, Problem5.fibonacci(5));
        assertEquals(1597, Problem5.fibonacci(17));
    }

    @Test
    void testProblem6() {
        assertEquals(1024, Problem6.power(2, 10));
        assertThrows(IllegalArgumentException.class, () -> Problem6.power(2, -1));
    }

    @Test
    void testProblem7() {
        String[] arr = {"1", "4", "6", "2"};
        Problem7.reverseArray(4, arr, 0);
        assertArrayEquals(new String[]{"2", "6", "4", "1"}, arr);
    }

    @Test
    void testProblem8() {
        assertEquals("Yes", Problem8.isAllDigits("123456"));
        assertEquals("No", Problem8.isAllDigits("123a12"));
        assertEquals("No", Problem8.isAllDigits(""));
    }

    @Test
    void testProblem9() {
        assertEquals(2, Problem9.binomialCoefficient(2, 1));
        assertEquals(35, Problem9.binomialCoefficient(7, 3));
    }

    @Test
    void testProblem10() {
        assertEquals(16, Problem10.gcd(32, 48));
        assertEquals(1, Problem10.gcd(10, 7));
    }
}