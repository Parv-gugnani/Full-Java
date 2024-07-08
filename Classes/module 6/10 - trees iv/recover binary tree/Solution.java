
public class Solution {
    public ArrayList<Integer> recoverTree(TreeNode A) {
        TreeNode first = null, second = null, prev = null, curr = A;
        TreeNode pre;
        
        while (curr != null) {
            if (curr.left == null) {
                // Visit the node
                if (prev != null && curr.val < prev.val) {
                    if (first == null) {
                        first = prev;
                    }
                    second = curr;
                }
                prev = curr;
                curr = curr.right;
            } else {
                // Find the inorder predecessor of current
                pre = curr.left;
                while (pre.right != null && pre.right != curr) {
                    pre = pre.right;
                }
                
                // Make current as the right child of its inorder predecessor
                if (pre.right == null) {
                    pre.right = curr;
                    curr = curr.left;
                } else {
                    // Revert the changes made in the tree
                    pre.right = null;
                    // Visit the node
                    if (prev != null && curr.val < prev.val) {
                        if (first == null) {
                            first = prev;
                        }
                        second = curr;
                    }
                    prev = curr;
                    curr = curr.right;
                }
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(Math.min(first.val, second.val));
        result.add(Math.max(first.val, second.val));
        return result;
    }
}
