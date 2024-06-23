
public class Solution {

    private int maxdia = 0;

    public int solve(TreeNode A) {
        calculate(A);
        return maxdia;
    }

    private int calculate(TreeNode node) {
        if(node == null) {
            return 0;
        }

        int leftHeight = calculate(node.left);
        int rightHeight = calculate(node.right);

        maxdia = Math.max(maxdia, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
