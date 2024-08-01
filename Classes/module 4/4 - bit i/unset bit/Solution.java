public class Solution {
    public int solve(int A, int B) {

        int mask = ~(1 << B);

        return A & mask;
    }
}
