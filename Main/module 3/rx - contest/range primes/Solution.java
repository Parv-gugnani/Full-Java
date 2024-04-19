import java.util.*;

public class Solution {
    
    // Function to check if a number is prime
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public int[] solve(int[] A, int[][] B) {
        int[] result = new int[B.length];
        for (int i = 0; i < B.length; i++) {
            int left = B[i][0] - 1; // Adjusting for 1-based indexing
            int right = B[i][1] - 1; // Adjusting for 1-based indexing
            int count = 0;
            for (int j = left; j <= right; j++) {
                if (isPrime(A[j])) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
