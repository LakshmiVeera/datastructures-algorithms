package Searching;

public class BinarySearch {

    public int findIndexOfSearchItem(int[] input, int searchEle, int begin, int end) {

        if (input != null && input.length > 0) {
            int m = (begin+end) / 2;

            if (input[m] == searchEle) {
                return m;
            }
            if ( input[m] > searchEle) {
                return findIndexOfSearchItem(input, searchEle, begin, m-1);
            }
            if (input[m] < searchEle) {
                return findIndexOfSearchItem(input, searchEle, m + 1, end);
            }
        }
        return -1;
    }

       public static void main (String... args) {
        BinarySearch  binarySearch = new BinarySearch();
        System.out.println(binarySearch.findIndexOfSearchItem(new int[]{1,2,3,4,5,6,7,8,9}, 8, 0, 8));
    }
}
