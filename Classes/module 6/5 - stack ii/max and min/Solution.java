public class Solution {

    private static final int MOD = 1000000007;



    public int solve(int[] A) {
        int n = A.length;
        long result = 0;

        long[] leftMax = new long[n];
        long[] rightMax = new long[n];
        long[] leftMin = new long[n];
        long[] rightMin = new long[n];

        Stack<Integer> stack = new Stack<>();

        // Calculate leftMax
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && A[stack.peek()] <= A[i]) {
                stack.pop();
            }
            leftMax[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                stack.pop();
            }
            rightMax[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        stack.clear();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && A[stack.peek()] >= A[i]) {
                stack.pop();
            }
            leftMin[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && A[stack.peek()] > A[i]) {
                stack.pop();
            }
            rightMin[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            long maxContribution = A[i] * leftMax[i] * rightMax[i];
            long minContribution = A[i] * leftMin[i] * rightMin[i];
            result = (result + maxContribution - minContribution) % MOD;
        }

        return (int) ((result + MOD) % MOD); 
    }
}
