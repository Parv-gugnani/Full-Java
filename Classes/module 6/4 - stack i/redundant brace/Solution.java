
public class Solution {
    public int braces(String A) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : A.toCharArray()) {
            if (ch == ')') {
                int operatorCount = 0;
                while (!stack.isEmpty() && stack.peek() != '(') {
                    char top = stack.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        operatorCount++;
                    }
                }
                // Pop the '(' from the stack
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                // If no operators found within parentheses, it means redundant braces
                if (operatorCount == 0) {
                    return 1;
                }
            } else {
                // Push everything else onto the stack
                stack.push(ch);
            }
        }
        
        return 0;
    }