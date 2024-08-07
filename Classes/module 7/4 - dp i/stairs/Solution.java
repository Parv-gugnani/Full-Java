public class Solution {
    int mod = 1000000007;

    public int climbStairs(int A) {
        if (A == 1) return 1;
        if (A == 2) return 2;

        int[] dp = new int[A + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= A; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % mod;
        }

        return dp[A];
    }
}