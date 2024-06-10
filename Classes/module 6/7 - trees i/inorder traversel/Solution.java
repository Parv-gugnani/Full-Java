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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
         ArrayList<Integer> result = new ArrayList<>();
        inorder(A, result);
        return result;
    }

     private void inorder(TreeNode node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        inorder(node.left, result); 
        result.add(node.val); 
        inorder(node.right, result);
    }


}