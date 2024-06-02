import java.util.Arrays;

public class Solution {
    public boolean canPlaceCows(int[] A, int B, int minDist) {
        int cowsPlaced = 1;
        int lastPos = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] - lastPos >= minDist) {
                cowsPlaced++;
                lastPos = A[i];
            }
        }

        return cowsPlaced >= B;
    }

    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int low = 0;
        int high = A[A.length - 1] - A[0];
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPlaceCows(A, B, mid)) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
