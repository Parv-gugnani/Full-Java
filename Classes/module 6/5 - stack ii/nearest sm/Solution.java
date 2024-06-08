public class Solution {
    public int[] prevSmaller(int[] A) {
        int n = A.length;
        int[] nsl = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= A[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = stack.peek();
            }

            stack.push(A[i]);
        }

        return nsl;
    }
}