public class Solution {
    public int solve(int[] A) {
        HashMap<Long, Integer> sumMap = new HashMap<>();
        long cumSum =0;
        int maxLength =0;
        
        for (int i = 0; i < A.length; i++) {
            cumSum += A[i];

            if(cumSum == 0){
                maxLength = i + 1;
            } else if(sumMap.containsKey(cumSum)){
                 int length = i - sumMap.get(cumSum);
                maxLength = Math.max(maxLength, length);
            } else {
                sumMap.put(cumSum, i);
            }
        }

        return maxLength;
    }
}