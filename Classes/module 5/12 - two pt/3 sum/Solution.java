public class Solution {
    public int threeSumClosest(int[] A, int B) {
        Arrays.sort(A);
        int n = A.length;
        int closestSum = A[0] + A[1] + A[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = A[i] + A[left] + A[right];

                if (Math.abs(currentSum - B) < Math.abs(closestSum - B)) {
                    closestSum = currentSum;
                }

                if (currentSum < B) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }
}