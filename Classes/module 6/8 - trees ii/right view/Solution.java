public class Solution {
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        if (A == null) return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(A);
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            TreeNode rightmost = null;
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    rightmost = node;
                    if (node.left != null) queue.offer(node.left);
                    if (node.right != null) queue.offer(node.right);
                }
            }
            
            if (rightmost != null) {
                result.add(rightmost.val);
            }
        }
        
        return result;
    }
}
