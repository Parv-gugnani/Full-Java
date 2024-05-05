public class Solution {
    public int solve(int[] A, int B) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        final int mod = (int)(1e9 + 7);
        long ans = 0;
        for(int i = 0 ; i < A.length ; i++){
            ans += freq.getOrDefault(A[i] - B, 0) + freq.getOrDefault(A[i] + B, 0);
            freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
        }
        return (int)(ans % mod);
    }
}