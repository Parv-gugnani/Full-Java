public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int maxElement = Integer.MIN_VALUE;
    
        for (int num : A) {
            maxElement = Math.max(maxElement, num);
        }
        
        int[] count = new int[maxElement + 1];
        
        for (int num : A) {
            count[num]++;
        }
        
        for (int i = 1; i <= maxElement; i++) {
            count[i] += count[i - 1];
        }
        
        int[] result = new int[n];
        
        for (int i = n - 1; i >= 0; i--) {
            result[count[A[i]] - 1] = A[i];
            count[A[i]]--;
        }
        
        return result;
    }
}