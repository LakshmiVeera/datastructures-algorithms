package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayOperations {

    public static void main(String... args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        mostFreWord(paragraph, banned);
    }

    public static String mostFreWord(String paragraph, String[] banned) {

        String mostFrequentWord = "";
        if (paragraph != null && banned != null) {
            HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
            String[] words = paragraph.split("\\W+");
            int max = 0;
            for (String word : words) {
                word = word.toLowerCase();
                if (!Arrays.asList(banned).contains(word)) {
                    wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);

                    if (wordMap.getOrDefault(word, 0) > max) {
                        max = wordMap.getOrDefault(word, 0);
                        mostFrequentWord = word;
                    }
                }
            }
        }
        return mostFrequentWord;
    }
}
