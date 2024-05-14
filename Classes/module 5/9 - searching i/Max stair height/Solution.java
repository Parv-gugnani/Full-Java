public class Solution {
    public int solve(int A) {

         if (A == 0) {
            return 0;
        }

        long lo = 0;
        long hi = A;
        long ans = 0;

        while(lo <= hi){

            long  mid = lo + (hi - lo) / 2;
            long sum = mid * (mid + 1) / 2;


            if(sum <= A){
                ans = mid;
                lo = mid + 1;
            }

            else{
                hi = mid -1;
            }
        }

        return (int) ans;

    }
}
