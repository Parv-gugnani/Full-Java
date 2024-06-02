public class Solution {
    public int solve(int[] A) {
        return binarySearch(A, 0, A.length - 1);
    }

    // Binary search function to find peak
    private int binarySearch(int[] A, int low, int high) {
        if (low == high) {
            return A[low];
        }

        int mid = low + (high - low) / 2;

        // Check if mid element is a peak
        if ((mid == 0 || A[mid - 1] <= A[mid]) && (mid == A.length - 1 || A[mid + 1] <= A[mid])) {
            return A[mid];
        }

        // If the left neighbor is greater than the mid element,
        // there might be a peak in the left half
        if (mid > 0 && A[mid - 1] > A[mid]) {
            return binarySearch(A, low, mid - 1);
        }
        // Otherwise, there might be a peak in the right half
        else {
            return binarySearch(A, mid + 1, high);
        }
    }
}
