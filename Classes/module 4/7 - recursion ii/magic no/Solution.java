public class Solution {
    public int solve(int A) {
        while(A >= 10){
            A = sumd(A);
        }
        return (A == 1) ? 1 : 0;
    }

    private int sumd(int n){
        int sum =0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
