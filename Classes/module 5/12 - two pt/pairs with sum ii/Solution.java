public class Solution {
    public int solve(int[] A, int B) {
        int mod = 1000000007;
        int left = 0, right = A.length - 1;
        long count = 0;
        
        while (left < right) {
            long sum = (long) A[left] + A[right];
            if (sum == B) {
                if (A[left] == A[right]) {
                    // All elements between left and right are the same
                    long numElements = right - left + 1;
                    count += (numElements * (numElements - 1)) / 2;
                    count %= mod;
                    break;
                } else {
                    // Count duplicates on both sides
                    int leftCount = 1, rightCount = 1;
                    while (left + 1 < right && A[left] == A[left + 1]) {
                        leftCount++;
                        left++;
                    }
                    while (right - 1 > left && A[right] == A[right - 1]) {
                        rightCount++;
                        right--;
                    }
                    count += (long) leftCount * rightCount;
                    count %= mod;
                    left++;
                    right--;
                }
            } else if (sum < B) {
                left++;
            } else {
                right--;
            }
        }
        
        return (int) count;
    }
}