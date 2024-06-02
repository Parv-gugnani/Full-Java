import java.util.List;

public class Solution {
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        int m = a.size();
        int n = b.size();

        if (m > n) {
            return findMedianSortedArrays(b, a);
        }

        int low = 0;
        int high = m;

        while (low <= high) {
            int partitionA = (low + high) / 2;
            int partitionB = (m + n + 1) / 2 - partitionA;

            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : a.get(partitionA - 1);
            int minRightA = (partitionA == m) ? Integer.MAX_VALUE : a.get(partitionA);

            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : b.get(partitionB - 1);
            int minRightB = (partitionB == n) ? Integer.MAX_VALUE : b.get(partitionB);

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                if ((m + n) % 2 == 0) {
                    return (double) (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2;
                } else {
                    return (double) Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                high = partitionA - 1;
            } else {
                low = partitionA + 1;
            }
        }

        throw new IllegalArgumentException("Arrays are not sorted.");
    }
}
