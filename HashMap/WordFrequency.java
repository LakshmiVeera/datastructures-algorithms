package HashMap;

import java.util.HashMap;

/* Find the most frequent word from the given sentence (assuming there is one word that repeated more than other words) */
public class WordFrequency {
    public String getMostFrequentWord(String sentence) {
        int maxFreq = 0;
        String mostFrequentWord = null;
        String[] words = sentence.split(" ");
        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
        for (String word : words) {
            int currFreq = wordMap.getOrDefault(word, 0) + 1;
            wordMap.put(word, currFreq);
            if(currFreq > maxFreq) {
                maxFreq = currFreq;
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;
    }
    public static void main(String[] args) {
        String sentence = "HashMap stores the data in the form of key value pairs.";
        WordFrequency wordFrequency = new WordFrequency();
        System.out.println(wordFrequency.getMostFrequentWord(sentence));
    }
}
