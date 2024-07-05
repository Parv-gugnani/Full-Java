
class Pair {

    public TreeNode first;
    public int second;

    public Pair(TreeNode x, int y) {
        first = x;
        second = y;
    }
}

public class Solution {
    public ArrayList < Integer > topview(TreeNode root) {
        ArrayList < Integer > ans = new ArrayList < Integer > ();
        if (root == null)
            return ans;

        Queue < Pair > level = new LinkedList < Pair > ();

        level.add(new Pair(root, 0));
        HashMap < Integer, Integer > top = new HashMap < Integer, Integer > ();
        //Using Level order traversal to find the top view
        while (level.size() != 0) {
            Pair curr = level.peek();
            level.remove();
            if (top.get(curr.second) == null)
                top.put(curr.second, curr.first.val);

            if (curr.first.left != null) {
                level.add(new Pair(curr.first.left, curr.second - 1));
            }
            if (curr.first.right != null) {
                level.add(new Pair(curr.first.right, curr.second + 1));
            }
        }

        for (Map.Entry elem: top.entrySet()) {
            ans.add((int) elem.getValue());
        }
        return ans;
    }
    public ArrayList < Integer > solve(TreeNode A) {
        return topview(A);
    }
}