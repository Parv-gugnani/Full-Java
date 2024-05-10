public class Solution {
    public int solve(int[] A) {
        int chunks = 0;
        int maxSoFar = 0;

        for(int i = 0; i < A.length; i++){
        maxSoFar = Math.max(maxSoFar, A[i]);

            if(maxSoFar == i){
                chunks++;
            }
        }

        return chunks;
    }
}
