public class Solution {
    public int hasPathSum(TreeNode A, int B) {
        if (A == null) {
            return 0;
        }
        
        if (A.left == null && A.right == null) {
            return (A.val == B) ? 1 : 0;
        }
        
        int remainingSum = B - A.val;
        return (hasPathSum(A.left, remainingSum) == 1 || hasPathSum(A.right, remainingSum) == 1) ? 1 : 0;
    }
}
