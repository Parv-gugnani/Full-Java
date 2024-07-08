
public class Solution {
    public int solve(TreeNode A, int B, int C) {
        // Find LCA of nodes B and C
        TreeNode lca = findLCA(A, B, C);
        
        // Calculate distance from LCA to B
        int distB = findDistance(lca, B, 0);
        
        // Calculate distance from LCA to C
        int distC = findDistance(lca, C, 0);
        
        // Return the sum of distances
        return distB + distC;
    }
    
    private TreeNode findLCA(TreeNode node, int B, int C) {
        if (node == null) {
            return null;
        }
        
        if (node.val == B || node.val == C) {
            return node;
        }
        
        TreeNode left = findLCA(node.left, B, C);
        TreeNode right = findLCA(node.right, B, C);
        
        if (left != null && right != null) {
            return node;
        }
        
        return (left != null) ? left : right;
    }
    
    private int findDistance(TreeNode node, int val, int distance) {
        if (node == null) {
            return -1;
        }
        
        if (node.val == val) {
            return distance;
        }
        
        int leftDistance = findDistance(node.left, val, distance + 1);
        if (leftDistance != -1) {
            return leftDistance;
        }
        
        return findDistance(node.right, val, distance + 1);
    }
}
