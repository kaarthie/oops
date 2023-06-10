package generics;
import java.util.Stack;
public class Stack_StringReversal {
    public static String fun(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "KARTHI";
        String rev = fun(input);
        System.out.println(rev);
    }
}
