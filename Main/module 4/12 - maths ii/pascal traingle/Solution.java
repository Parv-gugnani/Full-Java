public class Solution {
    public int[][] solve(int A) {
        
        int[][] res = new int[A][A];
	    res[0][0] = 1;
	    for (int i = 1; i < A; i++) {
	        for (int j = 0; j <= i; j++) {
	            if (j == 0 || j == i) res[i][j] = 1;
	            else{
	                res[i][j] = res[i-1][j] + res[i-1][j-1];
	            }
	        }
	    }
	    
	    return res;
    }
}