public class Solution {
    private static final int MOD = 1000000007;
    private int[] log2;
    private long[][] nCk;

    public int solve(int A) {
        if (A <= 1) {
            return 1;
        }

        log2 = new int[A + 1];
        for (int i = 2; i <= A; i++) {
            log2[i] = log2[i / 2] + 1;
        }

        nCk = new long[A + 1][A + 1];
        for (int i = 0; i <= A; i++) {
            nCk[i][0] = nCk[i][i] = 1;
            for (int j = 1; j < i; j++) {
                nCk[i][j] = (nCk[i - 1][j - 1] + nCk[i - 1][j]) % MOD;
            }
        }

        return (int) countHeaps(A);
    }

    private long countHeaps(int n) {
        if (n <= 1) {
            return 1;
        }

        int h = log2[n];
        int maxNodesInLastLevel = 1 << h;
        int actualNodesInLastLevel = n - ((1 << h) - 1);
        int left = (1 << (h - 1)) - 1 + Math.min(maxNodesInLastLevel / 2, actualNodesInLastLevel);
        int right = n - 1 - left;

        long leftHeaps = countHeaps(left);
        long rightHeaps = countHeaps(right);

        return (leftHeaps * rightHeaps % MOD * nCk[n - 1][left] % MOD) % MOD;
    }
}
