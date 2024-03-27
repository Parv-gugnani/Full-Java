public class Main {
    public int maxSubArray(final int[] A) {
        int cursum = 0;
           int maxsum = Integer.MIN_VALUE;


            for(int i = 0 ; i< A.length ;i++){
                cursum += A[i];
                if(cursum > maxsum){
                    maxsum = cursum;
                }
                if(cursum < 0){
                    cursum =0;
                }
            }
                return maxsum;

    }
}
