package Arrays;

import java.util.*;
/*
    Remove the duplicates from the given array and return the array
 */
public class RemoveDuplicates {
    int j = 0;
    public int[] noDuplicates(int[] arr) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) != null) {
                continue;
            } else {
                map.put(arr[i], true);
                arr[j] = arr[i];
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {3, 6, 4, 7, 7, 3, 4, 1};
        Arrays.sort(arr);
        RemoveDuplicates nonDuplicatesArr = new RemoveDuplicates();
        nonDuplicatesArr.noDuplicates(arr);
        for (int i = 0; i < nonDuplicatesArr.j; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
