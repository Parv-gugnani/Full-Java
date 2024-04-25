import java.util.*;

public class Solution {
    private static final int MOD = 1000003;

    public int findRank(String A) {
        int n = A.length();
        int rank = 1;

        // Calculate the factorial of the length of the string
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (int) ((fact[i - 1] * (long) i) % MOD);
        }

        // Calculate the frequency of characters in the string
        int[] freq = new int[256];
        for (char c : A.toCharArray()) {
            freq[c]++;
        }

        for (int i = 0; i < n; i++) {
            // Calculate the rank contribution of the current character
            int smaller = 0;
            for (char c = 0; c < A.charAt(i); c++) {
                smaller += freq[c];
            }

            // Update the rank
            rank = (int) ((rank + (long) (smaller * fact[n - i - 1]) % MOD) % MOD);

            // Update the frequency of the current character
            freq[A.charAt(i)]--;
        }

        return rank;
    }
}
