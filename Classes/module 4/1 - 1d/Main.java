//One Dimensional

import java.util.ArrayList;

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

    public ArrayList<Integer> flip(String A) {
        int cur = 0;
        int maxx = 0, l = 0, r = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(-1);
        ans.add(-1);
        //basic kadane's algorithm implementation
        for(int i = 0 ; i < A.length() ; i++){
            if(A.charAt(i) == '1')
                cur--;
            else 
                cur++;
            if(cur > maxx){   
                ans.set(0, l+1);
                ans.set(1, r+1);
                maxx = cur;
            }
            if(cur < 0) {
                cur = 0;
                l = i+1;
                r = i+1;
            }
            else 
                r++;
        }
        if(maxx == 0){
            return new ArrayList<Integer>();
        }
        else return ans;
    }


    //Q2 - aditional finding good days

    public int solve(int A) {
        int ans = 0;
        while(A>0){
            if(A%2==1) ans++;
            A /= 2;
        }
        return ans;
    }
}
