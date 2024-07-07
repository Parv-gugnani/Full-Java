public class Solution {
    public int t2Sum(TreeNode A, int B) {
        ArrayList<Integer> elements = new ArrayList<>();
        inOrderTraversal(A, elements);
        
        int left = 0;
        int right = elements.size() - 1;
        
        while (left < right) {
            int sum = elements.get(left) + elements.get(right);
            if (sum == B) {
                return 1;
            } else if (sum < B) {
                left++;
            } else {
                right--;
            }
        }
        return 0;
    }
    
    private void inOrderTraversal(TreeNode node, ArrayList<Integer> elements) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left, elements);
        elements.add(node.val);
        inOrderTraversal(node.right, elements);
    }
}