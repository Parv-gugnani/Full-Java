public class Solution {
    public Long solve(Long A, int B) {
        long mask = (1L << B) -1;

        mask = ~mask;
        return A & mask;
    }
}
