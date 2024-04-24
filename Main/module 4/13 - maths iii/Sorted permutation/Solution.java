public class Solution {
    public int findRank(String A) {
        int n = A.length();
        long rank = 1;
        int mod = 1000003;

        long[] factorial = new long[n + 1];
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            factorial[i] = (factorial[i - 1] * i) % mod;
        }

        for (int i = 0; i < n; i++) {
            int smaller = 0; 

            for (int j = i + 1; j < n; j++) {
                if (A.charAt(j) < A.charAt(i)) {
                    smaller++;
                }
            }

            rank = (rank + (smaller * factorial[n - i - 1]) % mod) % mod;
        }

        return (int) rank;
    }
}
