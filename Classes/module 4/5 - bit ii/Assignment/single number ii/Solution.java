public class Solution {
    public int singleNumber(final List < Integer > A) {
        int ones = 0, twos = 0, threes = 0;
        for (int num : A) {
            
            twos |= ones & num;

            ones ^= num;

            threes = ones & twos;
            ones &= ~threes;
            twos &= ~threes;
        }
        return ones;
    }
}