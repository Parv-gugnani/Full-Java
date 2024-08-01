public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] ans = new int[2];
        int XOR = 0;
        for(int i = 0; i < n; i++){
            XOR ^= A[i];
        }
        for(int i = 1; i <= n + 2; i++){
            XOR ^= i;
        }
        
        int rightmost_set_bit = XOR & ~(XOR - 1);

        int x = 0, y = 0;
        for (int i = 0; i < n; i++){
            if((A[i] & rightmost_set_bit) > 0)
                x = x ^ A[i]; 
            else
                y = y ^ A[i];
        }
        for(int i = 1; i <= n + 2; i++){
            if ((i & rightmost_set_bit) > 0)
                x = x ^ i;
            else
                y = y ^ i; 
        }
        
        ans[0] = Math.min(x, y);
        ans[1] = Math.max(x, y);
        return ans;
    }
}
