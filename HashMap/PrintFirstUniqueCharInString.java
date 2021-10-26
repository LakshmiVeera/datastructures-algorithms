package HashMap;

import java.util.*;
// Return the index of first unique char in the String or return -1 if doesn't exists.
class PrintFirstUniqueCharInString {
    public static int firstUniqChar(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for( char c : map.keySet()) {
            if (map.get(c) == 1) {
                return str.indexOf(c);
            }
        }
        return -1;
    }
    public static void main(String... args) {
        System.out.println(firstUniqChar("lakshmilaksh"));
    }
}