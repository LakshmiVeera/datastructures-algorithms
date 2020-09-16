package Strings;
import java.util.*;
/*
A string S of lowercase English letters is given. We want to partition this string into as many parts as possible so that 
each letter appears in at most one part, and return a list of integers representing the size of these parts.
*/
class LabelPartitioning {
    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i)
            last[S.charAt(i) - 'a'] = i;

        int j = 0, k = 0;
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < S.length(); ++i) {
            j = Math.max(j, last[S.charAt(i) - 'a']);
            if (i == j) {
                ans.add(i - k + 1);
                k = i + 1;
            }
        }
        return ans;
    }

    public static void main(String... args) {
        LabelPartitioning labelPartitioning = new LabelPartitioning();
        System.out.println(labelPartitioning.partitionLabels( "lakshmidevsoftware"));
    }
}
