package com.lakshmi.java;
import java.util.*;

class PrintFirstUniqueCharInString {
    public static int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for( char c : map.keySet()) {
            if (map.get(c) == 1) {
                return s.indexOf(c);
            }
        }
        return -1;
    }
    public static void main(String... args) {
        System.out.println(firstUniqChar("dddccdbba"));
    }
}