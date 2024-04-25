
public class Solution {


    //Q2. Implement Power Function
    public static int pow(int A, int B, int C) {
        if(A == 0)
        return 0;
        
    if(B == 0)
        return 1;

    long ans = pow(A, B / 2, C);
    ans = (ans * ans) % C;

    if(B % 2 == 1)
        ans = (ans * A);

    ans = (ans + C) % C;

    return (int)ans;
    }



    // is it magic Number Q2 ex
    public int solve(int A) {
        if (A < 10)
            return A == 1 ? 1 : 0;
        
        int sum = sumOfDigits(A);
        
        return solve(sum);
    }
    
    private int sumOfDigits(int num) {
        if (num < 10)
            return num;
        
        return sumOfDigits(num % 10 + sumOfDigits(num / 10));
    }
}
