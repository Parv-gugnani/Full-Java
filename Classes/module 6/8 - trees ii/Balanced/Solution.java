public class Solution {
    public int isBalanced(TreeNode A) {
        return isBalancedHelper(A) != -1 ? 1 : 0;
    }

    private int isBalancedHelper(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = isBalancedHelper(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = isBalancedHelper(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
