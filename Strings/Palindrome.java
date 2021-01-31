package Strings;

public class Palindrome {
    public boolean isPalindrome(String str) {
        int n  = str.length();
        for (int i = 0, j = n-1; i < n/2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome string = new Palindrome();
        System.out.println(string.isPalindrome("madam"));
        System.out.println(string.isPalindrome("e"));
        System.out.println(string.isPalindrome("logic"));
    }
}
