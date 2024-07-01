public class Solution {
    public int isValidBST(TreeNode A) {
        return isValidBST(A, null, null) ? 1 : 0;
    }

    private boolean isValidBST(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }
        
        int val = node.val;
        
        if (lower != null && val <= lower) {
            return false;
        }
        
        if (upper != null && val >= upper) {
            return false;
        }
        
        if (!isValidBST(node.right, val, upper)) {
            return false;
        }
        
        if (!isValidBST(node.left, lower, val)) {
            return false;
        }
        
        return true;
    }
}