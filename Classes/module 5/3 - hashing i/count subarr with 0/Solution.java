public class Solution {
    public int countSubarrayZeroSum(ArrayList<Integer> A) {
        Map<Long, Integer> prefixSumCount = new HashMap<>();
        long prefixSum = 0;
        int count = 0;
        
        // Initialize prefix sum count with 0 sum as 1
        prefixSumCount.put(0L, 1);
        
        for (int num : A) {
            prefixSum += num;
            // Check if prefix sum already exists, if yes, increment count
            if (prefixSumCount.containsKey(prefixSum)) {
                count += prefixSumCount.get(prefixSum);
            }
            // Increment prefix sum count
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }
        
        return count % 1000000007;
    }
}