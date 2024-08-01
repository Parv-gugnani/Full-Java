public class Solution {
    public int solve(int A) {

        int count = 0;
        while(A > 0){
            if(A % 2 == 0){
                A /= 2;
            }else{
                A -=1;
                count ++;
            }
        }

        return count;
    }
}
