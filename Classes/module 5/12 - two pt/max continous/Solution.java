
public class Solution {
    public ArrayList<Integer> maxone(ArrayList<Integer> A, int B) {
        int n = A.size();
        int left = 0, right = 0;
        int zeroCount = 0;
        int maxLen = 0;
        int bestLeft = 0;
        
        while (right < n) {
            if (A.get(right) == 0) {
                zeroCount++;
            }
            while (zeroCount > B) {
                if (A.get(left) == 0) {
                    zeroCount--;
                }
                left++;
            }
            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                bestLeft = left;
            }
            right++;
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = bestLeft; i < bestLeft + maxLen; i++) {
            result.add(i);
        }
        
        return result;
    }
}
