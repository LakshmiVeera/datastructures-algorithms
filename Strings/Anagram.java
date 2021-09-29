package Strings;

import java.util.*;

/**
 * Verify whether 2 strings are anagrams or not
  */
public class Anagram {

    // Sorting Approach
    public boolean isAnagram1(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        if (String.valueOf(s1Array).equalsIgnoreCase(String.valueOf(s2Array))) {
            return true;
        }
        return false;
    }

    // Using a map and verify character count on both Strings
    public boolean isAnagram(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();

        if(s1.length() != s2.length()) {
            return false;
        }
        // Store each char and it's count in the map
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i)+1,1));
        }
        // Iterate through second string and subtract 1 for each char
        for (int i = 0; i < s2.length(); i++) {
            char key = s2.charAt(i);
            if(!map.containsKey(key)) {
                return false;
            }
            else if (map.get(key) > 0) {
                map.put(s2.charAt(i), map.get(key)-1);
            }
        }
        // If any char count is not zero, return false
        for (char k : map.keySet()) {
            if(map.get(k) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Anagram string = new Anagram();
        System.out.print(string.isAnagram("cinema", "iceman"));
        System.out.print(string.isAnagram("movies", "iceman"));
    }
}
