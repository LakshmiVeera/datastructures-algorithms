package Sorting;

/* Return the sorted array using insertion sort */
public class InsertionSort {
    public int[] getSortedArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int currentEle = arr[i];
            int j = i-1;
            while(j >= 0 && currentEle < arr[j]) {
                arr[j+1] = arr[j];
                j = j -1;
            }
            arr[j+1] = currentEle;
            continue;

        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {8,2,0,-3,30};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.getSortedArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
