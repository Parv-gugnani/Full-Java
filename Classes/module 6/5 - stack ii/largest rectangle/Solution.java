public class Solution {
    public int largestRectangleArea(int[] A) {
        Stack < Integer > stack = new Stack < Integer > ();
        int ans = -1, n = A.length;
        for (int i = 0; i < A.length; i++) {
            while (!stack.empty() && A[i] < A[stack.peek()]) {
                int ind = stack.peek();
                stack.pop();

                if (!stack.empty()) 
                    ans = Math.max(ans, (i - stack.peek() - 1) * A[ind]);
                else ans = Math.max(ans, i * A[ind]);
            }
            stack.push(i);
        }
        while (!stack.empty()) {
            int ind = stack.peek();
            stack.pop();
            
            if (!stack.empty()) 
                ans = Math.max(ans, (n - stack.peek() - 1) * A[ind]);
            else ans = Math.max(ans, (n) * A[ind]);
        }
        return ans;
    }
}