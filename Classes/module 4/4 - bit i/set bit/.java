public class Solution {
    public int solve(int A, int B) {
        int maskA = 1 << A;
        int maskB = 1 << B;

        int result = maskA | maskB;

        return result;
    }
}
