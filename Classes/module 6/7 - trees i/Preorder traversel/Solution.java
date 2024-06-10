public class Solution {
    
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        preorder(A, result);
        return result;
    }

    private void preorder(TreeNode node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }
        result.add(node.val); // Visit the root node
        preorder(node.left, result); // Traverse the left subtree
        preorder(node.right, result); // Traverse the right subtree
    }
}