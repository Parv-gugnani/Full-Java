/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left = null;
 *      right = null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        while(q.size() != 0){
            TreeNode cur = q.peek();
            q.remove();
            if(cur == null){
                ans.add(-1);
                continue;
            }
            
            ans.add(cur.val);
            q.add(cur.left);
            q.add(cur.right);
        }
        return ans;
    }
}