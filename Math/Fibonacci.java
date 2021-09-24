package Math;

import java.util.HashMap;
import java.util.Map;

// Find the nth value in the fibonacci series  1 1 2 3 5 8 13
public class Fibonacci {

    // Declare the map cache for Dynamic Programming
    Map<Integer, Integer> cache = new HashMap<>();

    // Fibonacci using Recursive approach
    public int findFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return findFibonacci(n-1) + findFibonacci(n-2);
    }

    // Fibonacci using Dynamic Programming
    public int findFibonacciDP(int n) {

        if (n <= 1) {
            return n;
        }

        // If the required fib value is there in the cache, return it
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        // If the value is not in the cache, calculate it and store it in the map
        int fibVal = findFibonacciDP(n-1) + findFibonacciDP(n-2);
        cache.put(n, fibVal);

        return fibVal;
    }

    public static void main(String... args) {
        int n = 1000;
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.findFibonacciDP(n));
    }
}
