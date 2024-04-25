import java.util.*;

public class Solution {
    public int solve(ArrayList<Integer> A) {
        
        int n = A.size(), mod = 1000 * 1000 * 1000 + 7;
        
        int[] cnt = new int[1009];
        
        for(int a: A)    
            cnt[a]++;
            
        int ans = 0;
        
        for(int i = 1; i <= 1000; i++){
            if(cnt[i] == 0)    
                continue;
            for(int j = 1; j <= 1000; j++){
                if(cnt[j] == 0)    
                    continue;


                int val = j % i;
                int temp = cnt[i] * cnt[j] * val;
                ans = ((ans % mod) + (temp % mod)) % mod;
            }
        }
        return ans;
    }
}