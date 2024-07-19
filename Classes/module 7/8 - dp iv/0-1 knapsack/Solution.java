public class Solution {
    public int solve(int[] A, int[] B, int C) {
    int N = A.length;
        int[] dp = new int[C + 1];

        // Initialize the dp array
        for (int i = 0; i <= C; i++) {
            dp[i] = 0;
        }

        // Build the dp array
        for (int i = 0; i < N; i++) {
            for (int j = C; j >= B[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - B[i]] + A[i]);
            }
        }

        // Find the maximum value that can be obtained with capacity C
        int maxValue = 0;
        for (int i = 0; i <= C; i++) {
            maxValue = Math.max(maxValue, dp[i]);
        }

        return maxValue;
    }
}