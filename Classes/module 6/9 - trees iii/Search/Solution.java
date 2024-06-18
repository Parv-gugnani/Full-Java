public class Solution {
    public int solve(TreeNode A, int B) {
        TreeNode curr = A;

        while(curr != null){
            if(curr.val == B){
                return 1;
            }
            else if(curr.val > B){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
        return 0;
    }
}
