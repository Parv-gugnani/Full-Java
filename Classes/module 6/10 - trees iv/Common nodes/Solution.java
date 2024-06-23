

public class Solution {
    public int solve(TreeNode A, TreeNode B) {
        final int MOD = 1000000007;
        int sum = 0;
        
        Stack<TreeNode> stackA = new Stack<>();
        Stack<TreeNode> stackB = new Stack<>();
        TreeNode currA = A;
        TreeNode currB = B;
        
        // Iterative inorder traversal
        while (currA != null || !stackA.isEmpty() || currB != null || !stackB.isEmpty()) {
            // Reach the leftmost node in both trees A and B
            while (currA != null) {
                stackA.push(currA);
                currA = currA.left;
            }
            while (currB != null) {
                stackB.push(currB);
                currB = currB.left;
            }
            
            // Process current nodes at tops of both stacks
            if (!stackA.isEmpty() && !stackB.isEmpty()) {
                TreeNode topA = stackA.peek();
                TreeNode topB = stackB.peek();
                
                if (topA.val == topB.val) {
                    sum = (sum + topA.val) % MOD;
                    currA = topA.right;
                    currB = topB.right;
                    stackA.pop();
                    stackB.pop();
                } else if (topA.val < topB.val) {
                    currA = topA.right;
                    stackA.pop();
                } else {
                    currB = topB.right;
                    stackB.pop();
                }
            } else if (!stackA.isEmpty()) {
                currA = stackA.pop().right;
            } else if (!stackB.isEmpty()) {
                currB = stackB.pop().right;
            }
        }
        
        return sum;
    }
}
