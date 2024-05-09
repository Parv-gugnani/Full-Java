import java.util.Arrays;

public class Solution {
    public int solve(int[] A){

        Arrays.sort(A);

        int mindif = Integer.MAX_VALUE;

        for(int i = 1; i < A.length; i++){
            mindif = Math.min(mindif, Math.abs(A[i] - A[i - 1]));
        }

        return mindif;
    }    
}
