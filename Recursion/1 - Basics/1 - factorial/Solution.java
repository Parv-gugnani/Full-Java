public class Solution {
    public int solve(int n) {
        if(n==0 || n==1) return 1;
        

        return n * solve(n - 1);
    }
}