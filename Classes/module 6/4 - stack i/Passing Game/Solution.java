import java.util.Stack;

public class Solution {
    public int solve(int A, int B, int[] C) {
        Stack<Integer> passHistory = new Stack<>();

        int currPlayer = B;

        for(int i =0; i <A; i++){
            int pass = C[i];
            if(pass == 0){
                if(!passHistory.isEmpty()){
                    currPlayer = passHistory.pop();
                }
            }
            else{
                passHistory.push(currPlayer);
                currPlayer = pass;
            }
        }

        return currPlayer;
    }
}
