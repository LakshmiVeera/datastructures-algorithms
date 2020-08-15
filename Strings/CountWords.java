package Strings;

public class CountWords {
    public static void main(String... args) {
        String s = "   kjwng     jgnwe   egnewkt jnjew kjsdgnwekjg wekjjgnwejge";
        char[] c = s.toCharArray();
        int count = 1;
        for (int i = 0; i < c.length-1; i++) {
            if (c[i] != ' ' && ( c[i+1] == ' ' || i == c.length-1)) {
                count+=1;
            }
        }
        System.out.println(count);
    }
}
