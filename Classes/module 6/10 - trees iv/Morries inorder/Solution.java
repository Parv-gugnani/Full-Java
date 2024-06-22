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
    public ArrayList<Integer> solve(TreeNode A) {
        
        ArrayList<Integer> result = new ArrayList<>();

        TreeNode curr = A;

        while(curr != null){

            if(curr.left == null){
                result.add(curr.val);
                curr = curr.right;
            }
            else{
                TreeNode pre = curr.left;
                while(pre.right != null && pre.right != curr){
                    pre = pre.right;
                }

                if(pre.right == null){
                    pre.right = curr;
                    curr = curr.left;
                }else{
                    pre.right = null;
                    result.add(curr.val);
                    curr = curr.right;
                }
            }
        }

        return result;
    }
}
