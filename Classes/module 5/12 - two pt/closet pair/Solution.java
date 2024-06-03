public class Solution {
    public int[] solve(int[] A, int[] B, int C) {
         int n = A.length;
        int m = B.length;

        int i = 0; // Pointer for array A
        int j = m - 1; // Pointer for array B

        int closestSum = Integer.MAX_VALUE;
        int closestI = -1;
        int closestJ = -1;

        while (i < n && j >= 0) {
            int sum = A[i] + B[j];
            int diff = Math.abs(sum - C);

            if (diff < closestSum) {
                closestSum = diff;
                closestI = i;
                closestJ = j;
            } else if (diff == closestSum) {
                if (i < closestI || (i == closestI && j < closestJ)) {
                    closestI = i;
                    closestJ = j;
                }
            }

            if (sum > C) {
                j--;
            } else {
                i++;
            }
        }

        return new int[]{A[closestI], B[closestJ]};
    }
}
