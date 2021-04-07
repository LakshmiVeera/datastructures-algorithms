package Arrays;
/*
    Given an array of numbers. Return the total count of numbers that had even digits
 */
public class EvenNoOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String s = String.valueOf(nums[i]);
            if (s.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        EvenNoOfDigits numArray = new EvenNoOfDigits();
        System.out.print(numArray.findNumbers(new int[]{567, 8999, 34, 2, 1, 567}));
    }
}
