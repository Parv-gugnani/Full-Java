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
    public TreeNode solve(TreeNode A, int B) {
        return deleteNode(A, B);
    }

    private TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return null;
        }

        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }else if(key > root.val){
            root.right = deleteNode(root.right, key);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null || root.right == null){
                return (root.left != null) ? root.left : root.right;
            }else{
                TreeNode predecessor = findMax(root.left);
                root.val = predecessor.val;
                root.left = deleteNode(root.left, predecessor.val);
            }
        }
        return root;
    }

    private TreeNode findMax(TreeNode node){
        while(node.right != null){
            node = node.right;
        }
        return node;
    }
}
