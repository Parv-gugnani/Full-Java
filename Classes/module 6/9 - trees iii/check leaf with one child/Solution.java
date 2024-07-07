public class Solution {
    public String solve(int[] A) {
        int n = A.length;
        if (n == 0) return "YES";
        
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        
        for (int i = 1; i < n; i++) {
            if (A[i] < min || A[i] > max) {
                return "NO";
            }
            if (A[i] > A[i - 1]) {
                min = A[i - 1] + 1;
            } else {
                max = A[i - 1] - 1;
            }
        }
        
        return "YES";
    }
}
