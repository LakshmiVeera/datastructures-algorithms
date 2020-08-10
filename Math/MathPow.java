package Math;

/**
 * Verify if the given num is power of 4
 */
public class MathPow {
    // if a num is power of 4 , x = 4^a => a = log x base 4 = > (1/2)log x base 2   => is an integer,
    // then we can check if log x base 2 is an even number
    // o(1) time complexity
    public boolean isPowerOfFour(int x) {
        return x != 0 && ( Math.log(x)/Math.log(2) ) % 2 == 0;
    }

    // log(n) time complexity
    public boolean isPowerOfFourRecursion(int x) {
        if (x != 0) {
            while(x%4 == 0) {
                x = x/4;
            }
        }
        return x == 1;
    }

    public static void main(String... args) {
        MathPow mathPow = new MathPow();
        System.out.print( mathPow.isPowerOfFour(65));
    }
}
