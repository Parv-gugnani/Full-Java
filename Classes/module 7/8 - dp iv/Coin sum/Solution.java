public class Solution {
    public int coinchange2(int[] A, int B) {
    int mod = 1000007;
        int[] dp = new int[B + 1];
        
        dp[0] = 1;

        for (int coin : A) {
            for (int i = coin; i <= B; i++) {
                dp[i] = (dp[i] + dp[i - coin]) % mod;
            }
        }

        return dp[B];
    }
}