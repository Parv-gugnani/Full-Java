
public class Solution {
    public int solve(TreeNode A) {
        if (isSumTree(A) != -1) {
            return 1;
        } else {
            return 0;
        }
    }

    private int isSumTree(TreeNode node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return node.val;
        }

        int leftSum = isSumTree(node.left);
        int rightSum = isSumTree(node.right);

        if (leftSum == -1 || rightSum == -1) {
            return -1;
        }

        if (node.val == leftSum + rightSum) {
            return node.val + leftSum + rightSum;
        } else {
            return -1;
        }
    }
}
