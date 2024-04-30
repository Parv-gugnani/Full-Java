

public class Solution {

    public int solve(int A){
        if(A<10) return A;

        int last = A % 10;
        int sum = solve(A/10);

        return last + sum;
    }
    
}
