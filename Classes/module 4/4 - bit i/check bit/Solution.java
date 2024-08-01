public class Solution {
    public int solve(int A, int B) {
       
        int mask = 1 << B;


        if((A & mask) != 0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
