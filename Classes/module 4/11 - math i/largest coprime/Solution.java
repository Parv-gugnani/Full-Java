public class Solution {
    public int cpFact(int A, int B) {
        // While A and B have a common divisor greater than 1
        while (gcd(A, B) != 1) {
            // Divide A by their greatest common divisor
            A = A / gcd(A, B);
        }
        // The remaining A will be the largest coprime factor
        return A;
    }

    // Function to find the greatest common divisor (gcd) using Euclid's algorithm
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
