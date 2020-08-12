package SlidingWindow;

/**
 * Return the max sum of sub string of length k in the given string
 */
public class FindMaxSum {

    int maxSum = 0;
    int currentSum = 0;

    public int findMaxSum(int[] arr, int k) {
        for (int i  = 0; i < arr.length; i++) {
            currentSum  += arr[i];
            if (i >= k-1) {
                maxSum = Math.max(currentSum, maxSum);
                currentSum -= arr[i - (k-1)];
            }
        }
        return maxSum;
    }

    public static void main(String... args) {
        FindMaxSum findMaxSum = new FindMaxSum();
        System.out.println(findMaxSum.findMaxSum(new int[]{4, 2, 1, 7, 8, 1, 2,  8, 1, 0}, 3));
    }
}
