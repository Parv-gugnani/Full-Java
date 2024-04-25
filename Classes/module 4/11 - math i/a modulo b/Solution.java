public class Solution {
    public int solve(int A, int B) {
        int maxM = Math.abs(A - B);

        for (int M = maxM; M > 0; M--) {
            if (A % M == B % M) {
                return M;
            }
        }
        return -1;
    }
}
