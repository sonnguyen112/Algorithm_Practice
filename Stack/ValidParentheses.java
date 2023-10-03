package Stack;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (stack.size() > 0) {
                if (stack.peek() == '[') {
                    if (s.charAt(i) == ']') {
                        stack.pop();
                    } else {
                        stack.push(s.charAt(i));
                    }
                } else if (stack.peek() == '(') {
                    if (s.charAt(i) == ')') {
                        stack.pop();
                    } else {
                        stack.push(s.charAt(i));
                    }
                } else if (stack.peek() == '{') {
                    if (s.charAt(i) == '}') {
                        stack.pop();
                    } else {
                        stack.push(s.charAt(i));
                    }
                } else {
                    return false;
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
