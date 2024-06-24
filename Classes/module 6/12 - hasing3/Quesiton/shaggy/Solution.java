public class Solution {
    public int solve(int[] A) {
        HashMap<Integer, Integer> lastIndexMap = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;
        
        for (int i = 0; i < A.length; i++) {
            if (lastIndexMap.containsKey(A[i])) {
                int distance = i - lastIndexMap.get(A[i]);
                minDistance = Math.min(minDistance, distance);
            }
            lastIndexMap.put(A[i], i);
        }
        
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}
