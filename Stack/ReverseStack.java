package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseStack {
    List<Integer> list = new ArrayList<>();

    // Reverse a Stack using Recursion
    public void reverse(Stack stack) {
        if(stack.empty()) {
            for (int i : list) {
                stack.push(i);
            }
            return;
        }
        int item = (Integer)stack.pop();
        list.add(item);
        reverse(stack);
    }

    // Reverse a Stack using a new Stack
    public Stack reverse1(Stack stack) {
        Stack reverseStack = new Stack();

        while (!stack.isEmpty()) {
            reverseStack.push(stack.pop());
        }
        return reverseStack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        ReverseStack stackClass = new ReverseStack();

        System.out.print(stack + "  ");

        stackClass.reverse(stack);

        System.out.print(stack + "  ");

    }
}
