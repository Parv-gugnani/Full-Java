public class Solution {
    public int solve(int[] a, int k) {
        int n = a.length;
        long mod = (long)(1e9 + 7);
        long cnt[] = new long[k];
        // cnt[i] stores the count of elements such that their modulo k equals i
        for(int x : a)    cnt[x % k]++;
        long ans = cnt[0] * (cnt[0] - 1) / 2;
        for(int i = 1, j = k - 1; i <= j; i++, j--) {
            if(i == j)    
                ans = (ans + cnt[i] * (cnt[i] - 1) / 2) % mod;
            else    
                ans = (ans + cnt[i] * cnt[j]) % mod;
        }
        return (int)ans;
    }
}