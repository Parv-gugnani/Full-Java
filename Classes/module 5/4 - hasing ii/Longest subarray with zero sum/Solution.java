public class Solution {
    public int solve(int[] A) {
        HashMap<Long, Integer> pref = new HashMap<Long, Integer>();
        Long curr = 0L;
        int ans = 0;
        pref.put(0L, 0);
        for(int i = 1 ; i <= A.length ; i++){
            curr += A[i - 1];
            if(pref.containsKey(curr)){
                ans = Math.max(ans, i - pref.get(curr));
            }
            else{
                pref.put(curr, i);
            }
        }
        return ans;
    }
}