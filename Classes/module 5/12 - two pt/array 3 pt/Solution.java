public class Solution {
    public int minimize(final int[] A, final int[] B, final int[] C) {
        int i = 0, j = 0, k = 0;
        int minDiff = Integer.MAX_VALUE;

        while (i < A.length && j < B.length && k < C.length) {
            int maxVal = Math.max(Math.abs(A[i] - B[j]), Math.max(Math.abs(B[j] - C[k]), Math.abs(C[k] - A[i])));
            minDiff = Math.min(minDiff, maxVal);

            if (A[i] <= B[j] && A[i] <= C[k]) {
                i++;
            } else if (B[j] <= A[i] && B[j] <= C[k]) {
                j++;
            } else {
                k++;
            }
        }

        return minDiff;
    }
}