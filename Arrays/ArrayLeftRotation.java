package Arrays;

import java.util.Scanner;
/*
Rotate the 1D array(arr) to the left with n no.of left Rotations
input :  arr = {1, 2, 3, 4, 5}, n = 2
output : 3, 4, 5, 1, 2
*/

//
public class ArrayLeftRotation {
    public int[] leftRotate(int[] arr, int noOfRotations) {
        for (int i = 1; i <= noOfRotations; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the array length");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int noOfRotations = scanner.nextInt();

        ArrayLeftRotation arrays = new ArrayLeftRotation();
        arrays.leftRotate(arr, noOfRotations);

        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}
