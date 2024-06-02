public class Solution {
    public int findMedian(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        
        // Find the minimum and maximum values in the matrix
        for (int i = 0; i < N; i++) {
            low = Math.min(low, A[i][0]);
            high = Math.max(high, A[i][M - 1]);
        }
        
        // Binary search to find the median
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;
            
            // Count the number of elements less than or equal to mid
            for (int i = 0; i < N; i++) {
                count += countLessEqual(A[i], mid);
            }
            
            // If the count is less than or equal to half of total elements, update the lower bound
            if (count <= (N * M) / 2) {
                low = mid + 1;
            } else {
                high = mid - 1; // Otherwise, update the upper bound
            }
        }
        
        return low;
    }
    
    // Function to count the number of elements less than or equal to target in a sorted array
    private int countLessEqual(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return low;
    }
}