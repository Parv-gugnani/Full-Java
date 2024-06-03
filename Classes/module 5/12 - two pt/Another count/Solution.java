public class Solution {
    private static final int MOD = 1000000007;

    public int solve(int[] A, int B) {
        int n = A.length;
        int i = 0, j = n - 1;
        long count = 0;

        while (i <= j) {
            if ((long) A[i] * A[j] < B) {
                count += 2 * (j - i) + 1;
                count %= MOD;
                i++;
            } else {
                j--;
            }
        }

        return (int) count;
    }
}