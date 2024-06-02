public class Solution {
    public int search(final int[] A, int B) {
        int left = 0;
        int right = A.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (A[mid] == B)
                return mid;

            if (A[left] <= A[mid]) {
                if (A[left] <= B && B < A[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else {
                if (A[mid] < B && B <= A[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }
}
