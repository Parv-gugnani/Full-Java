public class Solution {
    public int[] solve(final int[] A, final int[] B) {
     
        int m = A.length;
        int n = B.length;
        int[] mergedArray = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (A[i] < B[j]) {
                mergedArray[k++] = A[i++];
            } else {
                mergedArray[k++] = B[j++];
            }
        }
        
        while (i < m) {
            mergedArray[k++] = A[i++];
        }
        
        while (j < n) {
            mergedArray[k++] = B[j++];
        }
        
        return mergedArray;
    }
}
