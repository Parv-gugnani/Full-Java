import java.util.*;

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int low = 1;
        int high = n;
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(A, B, mid)) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    private boolean isPossible(ArrayList<Integer> A, int B, int K) {
        long sum = 0;
        for (int i = 0; i < K; i++) {
            sum += A.get(i);
        }
        if (sum <= B) return true;

        for (int i = K; i < A.size(); i++) {
            sum += A.get(i) - A.get(i - K);
            if (sum <= B) return true;
        }

        return false;
    }
}
