import java.util.Stack;

public class Solution {
    public int solve(String A) {

        Stack<Character> stack = new Stack<>();

        for(char ch : A.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if(ch ==')' || ch =='}' || ch == ']'){
                if(stack.isEmpty()){
                    return 0;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return 0; 
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
