public class Solution {
    public int solve(int[] A) {
 int mod = 1000000007;
        int n = A.length;
        int i = 0;
        long count = 0;
        Set<Integer> set = new HashSet<>();
        
        for (int j = 0; j < n; j++) {
            // Expand the window by moving the j pointer
            while (set.contains(A[j])) {
                set.remove(A[i]);
                i++;
            }
            set.add(A[j]);
            count += (j - i + 1);
            count %= mod;
        }
        
        return (int) count;
    }
}