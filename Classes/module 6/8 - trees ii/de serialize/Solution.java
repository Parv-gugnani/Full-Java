

public class Solution {
    public TreeNode solve(ArrayList<Integer> A) {
        if (A == null || A.size() == 0) {
            return null;
        }

        TreeNode root = new TreeNode(A.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < A.size()) {
            TreeNode current = queue.poll();
            
            if (A.get(i) != -1) {
                TreeNode leftChild = new TreeNode(A.get(i));
                current.left = leftChild;
                queue.add(leftChild);
            }
            i++;
            
            if (i < A.size() && A.get(i) != -1) {
                TreeNode rightChild = new TreeNode(A.get(i));
                current.right = rightChild;
                queue.add(rightChild);
            }
            i++;
        }

        return root;
    }
}
