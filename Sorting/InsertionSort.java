package Sorting;

public class InsertionSort {

    public static int[] insertionSort(int[] inputArray) {
        if(inputArray == null || inputArray.length == 0) {
            return inputArray;
        }

        for (int j = 1; j < inputArray.length; j++) {
            int i = j-1;
            int key = inputArray[j];
            while (i >=0 && inputArray[i] > key) {
                inputArray[i+1] = inputArray[i];
                i--;
            }
            inputArray[i+1] = key;
        }
        return inputArray;
    }

    public static void main(String... args) {
            int[] inputArray = new int[]{5, 3, 21, 7, 1, 6};
            int[] sortedArray = insertionSort(inputArray);

            for (int i : sortedArray) {
                System.out.println(i);
            }
    }
}
