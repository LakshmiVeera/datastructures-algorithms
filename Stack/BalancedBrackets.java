package Stack;
import java.util.*;

/**
 * Verify if the given input String Brackets are balanced or not
 */
public class BalancedBrackets {
    public boolean isBracketsBalanced(String s) {

        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> map  = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                stack.push(c);
            } else {
                if (map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String... args) {
        BalancedBrackets balancedBrackets = new BalancedBrackets();
        System.out.println(balancedBrackets.isBracketsBalanced("{][this is lakshmi]{}"));
    }
}
