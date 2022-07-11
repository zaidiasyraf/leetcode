package easy;

import java.util.Stack;

public class ValidParantheses {

    public static void main(String[] args) {

    }

    public static boolean isValid(String s) {
        int parentheses = 0;
        int curly = 0;
        int square = 0;

        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c.equals('(') ) {
                parentheses = parentheses + 1;
                stack.push(c);
            } else if (c.equals(')') && !stack.isEmpty() && stack.pop().equals('(')) {
                parentheses = parentheses - 1;
            } else if (c.equals('{') ) {
                curly = curly + 1;
                stack.push(c);
            } else if (c.equals('}') && !stack.isEmpty() && stack.pop().equals('{')) {
                curly = curly - 1;
            } else if (c.equals('[') ) {
                square = square + 1;
                stack.push(c);
            } else if (c.equals(']') && !stack.isEmpty() && stack.pop().equals('[')) {
                square = square - 1;
            } else {
                return false;
            }

            if (parentheses < 0 || curly < 0 || square < 0) {
                return false;
            }
        }
        return parentheses == 0 && curly == 0 && square == 0;
    }
}
