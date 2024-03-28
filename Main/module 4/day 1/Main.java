public class Main {
    // public int maxSubArray(final int[] A) {
    //     int cursum = 0;
    //        int maxsum = Integer.MIN_VALUE;


    //         for(int i = 0 ; i< A.length ;i++){
    //             cursum += A[i];
    //             if(cursum > maxsum){
    //                 maxsum = cursum;
    //             }
    //             if(cursum < 0){
    //                 cursum =0;
    //             }
    //         }
    //             return maxsum;

    // }


    // add one to last element of the list array
    public int[] plusOne(int[] A) {
            int n = A.length;
    
            for (int i = n - 1; i >= 0; i--) {
                if (A[i] < 9) {
                    A[i]++;
                    return A;
                } else {
                    A[i] = 0;
                }
            }
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
    }
}
