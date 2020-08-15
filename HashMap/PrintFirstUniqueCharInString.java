package Strings;
import java.util.*;

class PrintFirstUniqueCharInString {
    public static int firstUniqChar(String s) {

        char[] stringCharArray = s.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < stringCharArray.length; i++) {
            map.put(stringCharArray[i], map.getOrDefault(stringCharArray[i], 0) + 1);
        }
        Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator();
        int i = 0;
        while (itr.hasNext()) {
            Map.Entry<Character, Integer> entry = itr.next();
            if (entry.getValue() == 1) {
                return   s.indexOf(entry.getKey());
            }
            i++;
        }
        return -1;
    }
    public static void main(String... args) {
        System.out.println(firstUniqChar("dddccdbba"));
    }
}