public class Solution {
    public int solve(int A) {
        int count = 0;
        int n = 1;
        
        while (true) {
            int numerator = A - (n * (n - 1)) / 2;
            
       
            if (numerator <= 0) {
                break;
            }
            
            if (numerator % n == 0) {
                count++;
            }
            
            n++;
        }
        
        return count;
    }
}
