
public class Solution {
    public int[] solve(TreeNode A) {
        
        if(A == null){
            return new int[0];
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> levels =  new ArrayList<>();
        queue.add(A);
        
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currlevel = new ArrayList<>();
            
            for(int i = 0;i < levelsize; i++){
                TreeNode node = queue.poll();
                currlevel.add(node.val);
            
             if(node.left != null){
                 queue.add(node.left);
             }
            
             if(node.right != null){
                 queue.add(node.right);
             }
            
            }
            levels.add(currlevel);
        }
        
        List<Integer> revList = new ArrayList<>();
        for(int i = levels.size() - 1; i >= 0; i--){
            revList.addAll(levels.get(i));
        }
        
        int[] result = new int[revList.size()];
        
        for(int i = 0; i < revList.size();i++){
            result[i] = revList.get(i);
        }
        
        
        return result;
    }
}
