public class Solution {
    public int solve(int[] A) {
        int N = A.length;
        int[] dp = new int[N + 1];
        
        // Initialize the DP array
        dp[0] = 0;

        // Build the DP array
        for (int i = 1; i <= N; i++) {
            int maxVal = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++) {
                maxVal = Math.max(maxVal, A[j - 1] + dp[i - j]);
            }
            dp[i] = maxVal;
        }

        // Return the maximum value obtainable for the rod of length N
        return dp[N];
    }
}