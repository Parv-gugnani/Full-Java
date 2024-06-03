public class Solution {
    public int maxArea(int[] A) {
        int left = 0;
        int right = A.length - 1;
        int maxArea = 0;

        while (left < right) {
            int height = Math.min(A[left], A[right]);
            int width = right - left;
            int area = height * width;
            maxArea = Math.max(maxArea, area);

            if (A[left] < A[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
