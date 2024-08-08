public class Solution {
    public int minimumTotal(ArrayList < ArrayList < Integer >> A) {
        int m, n;
        m = A.size();
        n = A.get(m - 1).size();
        int[] dp = new int[n + 1];
        int size = n;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < size; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + A.get(i).get(j);
            }
            size--;
        }
        return dp[0];
    }
}
