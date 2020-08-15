package Math;

public class Fibonacci {
    public static void main(String... args) {
        int n = 7;
        System.out.println(printFibonaaci(n));
    }

    // Recursive approach - Performance can be improved using caching
    public static int printFibonaaci(int n) {

        if (n <= 1) {
            return n;
        }
        return printFibonaaci(n-1) + printFibonaaci(n-2);
    }
}
