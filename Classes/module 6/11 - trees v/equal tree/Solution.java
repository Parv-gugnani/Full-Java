public class Solution {
    public int solve(TreeNode a) {
        Map < Long, Integer > map = new HashMap < > ();
        long tot = populate(a, map);
        // since total sum can also be zero
        if (tot == 0) 
            return map.getOrDefault(tot, 0) > 1 ? 1 : 0;
        return tot % 2 == 0 && map.containsKey(tot / 2) ? 1 : 0;
    }
    public long populate(TreeNode a, Map < Long, Integer > map) {
        if (a == null) 
            return 0;
        long sum = a.val + populate(a.left, map) + populate(a.right, map);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        return sum;
    }
}