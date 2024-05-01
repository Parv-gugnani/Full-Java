public class SubsetSum {
    public boolean hasSubsetSum(int[] nums, int target) {
        return backtrack(nums, target, 0, 0);
    }

    private boolean backtrack(int[] nums, int target, int index, int sum) {
        // Base case: If the sum equals the target, return true
        if (sum == target) {
            return true;
        }
        // If the sum exceeds the target or we've reached the end of the array, return false
        if (index == nums.length || sum > target) {
            return false;
        }
        // Include the current number in the subset
        if (backtrack(nums, target, index + 1, sum + nums[index])) {
            return true;
        }
        // Exclude the current number from the subset
        return backtrack(nums, target, index + 1, sum);
    }
}