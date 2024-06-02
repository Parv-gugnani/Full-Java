import java.util.*;

public class Solution {
    public int books(ArrayList<Integer> A, int B) {
        int n = A.size();
        if (n < B) return -1; // Not enough books to assign to each student

        // Define the search space
        int low = Collections.max(A);
        int high = A.stream().mapToInt(Integer::intValue).sum();

        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(A, B, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private boolean isPossible(ArrayList<Integer> A, int B, int maxPages) {
        int students = 1;
        int pages = 0;

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > maxPages) return false; // If any book has more pages than maxPages, it's not possible

            if (pages + A.get(i) <= maxPages) {
                pages += A.get(i);
            } else {
                students++;
                pages = A.get(i);
            }
        }

        return students <= B;
    }
}
