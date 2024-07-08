/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public int isSameTree(TreeNode A, TreeNode B) {
        if (isIdentical(A, B)) {
            return 1;
        } else {
            return 0;
        }
    }

    private boolean isIdentical(TreeNode A, TreeNode B) {
        // Both nodes are null
        if (A == null && B == null) {
            return true;
        }
        
        // One of the nodes is null
        if (A == null || B == null) {
            return false;
        }
        
        // Values of the nodes do not match
        if (A.val != B.val) {
            return false;
        }
        
        // Recursively check left and right subtrees
        return isIdentical(A.left, B.left) && isIdentical(A.right, B.right);
    }
}
