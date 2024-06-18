
public class Solution {
    public int[][] solve(TreeNode A) {
        if (A == null)
            return new int[0][0];

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(A);
        List<int[]> resultList = new ArrayList<>();

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int[] currentLevel = new int[levelSize];
            int index = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel[index++] = currentNode.val;

                if (currentNode.left != null)
                    queue.offer(currentNode.left);
                if (currentNode.right != null)
                    queue.offer(currentNode.right);
            }

            resultList.add(currentLevel);
        }

        int[][] result = new int[resultList.size()][];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
