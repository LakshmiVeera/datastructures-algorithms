package Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Print all the permutations of the given string. String permutation is all possible arrangement of characters in a string.
 * Example permutations of the set {1,2,3} =>  (1,2,3), (1,3,2), (2,1,3), (2,3,1), (3,1,2), and (3,2,1).
 */

/* Recursion and Backtracking */
public class StringPermutations {
    List<String> permutations = new ArrayList<String>();
    void printPermutations(String str, String permutation)
    {
        if (str.length() == 0) {
            System.out.print(permutation + " ");
            permutations.add(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Rest of the string without ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            printPermutations(ros, permutation + ch);
        }
    }

    public static void main(String[] args)
    {
        String s = "abc";
        StringPermutations ss = new StringPermutations();
        ss.printPermutations(s, "");
    }
}