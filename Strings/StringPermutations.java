package Strings;

/**
 * Print all the permutations of the given string. String permutation is all possible arrangement of characters in a string.
 * Example permutations of the set {1,2,3} =>  (1,2,3), (1,3,2), (2,1,3), (2,3,1), (3,1,2), and (3,2,1).
 */

public class StringPermutations {

    static void printPermutations(String str, String ans)
    {
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Rest of the string after excluding the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            printPermutations(ros, ans + ch);
        }
    }

    public static void main(String[] args)
    {
        String s = "lakshmi";
        printPermutations(s, "");
    }
}
