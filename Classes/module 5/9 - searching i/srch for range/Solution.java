public class Solution {
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        int leftIndex = findLeftmostIndex(A, B);
        int rightIndex = findRightmostIndex(A, B);
        ArrayList<Integer> result = new ArrayList<>();
        result.add(leftIndex);
        result.add(rightIndex);
        return result;
    }

    private int findLeftmostIndex(List<Integer> A, int B) {
        int left = 0, right = A.size() - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A.get(mid) == B) {
                result = mid;
                right = mid - 1; // continue searching to the left
            } else if (A.get(mid) < B) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private int findRightmostIndex(List<Integer> A, int B) {
        int left = 0, right = A.size() - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A.get(mid) == B) {
                result = mid;
                left = mid + 1; // continue searching to the right
            } else if (A.get(mid) < B) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
        

}
