public class Solution {
    public String solve(String A) {
   Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char c : A.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Remove the '(' from the stack
            } else {
                // c is an operator
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

      private int precedence(char c) {
        switch (c) {
            case '^': return 3;
            case '*': case '/': return 2;
            case '+': case '-': return 1;
            default: return -1;
        }
      }
}