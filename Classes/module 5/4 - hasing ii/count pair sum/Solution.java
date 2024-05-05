public class Solution {
    public int solve(int[] A, int B) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        final int mod = (int)(1e9 + 7);
        long ans = 0;
        for(int i = 0 ; i < A.length ; i++){
            if(freq.containsKey(B - A[i])){
                ans = (ans + freq.get(B - A[i])) % mod;
            }
            freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
        }
        return (int)(ans);
    }
}
