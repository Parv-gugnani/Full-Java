public class Solution {
    public int sqrt(int A) {

        if(A == 0 || A == 1){
            return A;
        }

        int l = 1; 
        int r = A;
        int ans = 1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            long square = (long) mid * mid;

            if(square == A){
                return mid;
            }
            else if(square < A){
                ans = mid;
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }

        return ans;
    }
}
