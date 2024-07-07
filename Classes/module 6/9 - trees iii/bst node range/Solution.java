public class Solution {
    public int solve(TreeNode A, int B, int C) {
        return countNodesInRange(A, B, C);
    }
    
    private int countNodesInRange(TreeNode node, int B, int C) {
        if (node == null) {
            return 0;
        }
        
        if (node.val >= B && node.val <= C) {
            return 1 + countNodesInRange(node.left, B, C) + countNodesInRange(node.right, B, C);
        } else if (node.val < B) {
            return countNodesInRange(node.right, B, C);
        } else {
            return countNodesInRange(node.left, B, C);
        }
    }
}