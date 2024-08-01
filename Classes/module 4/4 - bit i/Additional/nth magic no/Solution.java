public class Solution {
    public int solve(int A) {
        int ans = 0, x = 1;
        // converting to binary representation
        while(A > 0) {
            x *= 5;
            if(A % 2 == 1)    
                ans += x;
            A /= 2;
        }
        return ans;
    }
}