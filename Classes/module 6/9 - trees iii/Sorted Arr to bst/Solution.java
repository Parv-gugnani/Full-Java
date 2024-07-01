public class Solution {
    public TreeNode sortedArrayToBST(final int[] A) {
        if (A == null || A.length == 0) {
            return null;
        }
        return sortedArrayToBST(A, 0, A.length - 1);
    }

    private TreeNode sortedArrayToBST(final int[] A, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(A[mid]);
        node.left = sortedArrayToBST(A, start, mid - 1);
        node.right = sortedArrayToBST(A, mid + 1, end);

        return node;
    }

    public static void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.val + " ");
            printInOrder(root.right);
        }
    }
}
