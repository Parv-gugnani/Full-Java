public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        int[] idx = new int[32];
        long ans = 0;
        for (int i = 1; i <= n; ++i) {
            long tmp = A[i - 1];
            for (int j = 0; j <= 31; ++j) {
                long pw = 1 << j;
                if ((tmp & pw) != 0) { 
                    ans += pw * i; 
                    idx[j] = i; 
                } else if (idx[j] != 0)
                {
                    ans += pw * idx[j]; 
                } 
            }
        }
        return (int)(ans % 1000000007);
    }
}