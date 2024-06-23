/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {

        if(root == null) return;

        Queue<TreeLinkNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            TreeLinkNode prev = null;

            for(int i=0; i< size; i++){
                TreeLinkNode node = queue.poll();

                if(prev != null){
                    prev.next =node;
                }
                prev = node;

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }

        }
        
    }
}
