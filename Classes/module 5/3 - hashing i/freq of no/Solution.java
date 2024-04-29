import java.util.*;

public class Solution {
    public int[] solve(int[] A, int[] B) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < A.length; i++){
            if(map.containsKey(A[i]) == false){
                map.put(A[i], 1);
            }
            else{
                int ov = map.get(A[i]);
                map.put(A[i], ov + 1);
            }
        }

        int[] ans = new int[B.length];

        for(int i = 0; i < B.length; i++){
            if(map.containsKey(B[i] ) == false){
                ans[i]=0;
            }
            else{
                ans[i]=map.get(B[i]);
            }
        }

        return ans;

        
    }
}
