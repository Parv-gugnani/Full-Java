public class Solution {
    public int solve(ArrayList < Integer > A) {
        int n = A.size();
        ArrayList < ArrayList < Integer >> graph = new ArrayList < ArrayList < Integer >> ();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList < Integer > ());
        }
        int root = -1;
        for (int i = 0; i < n; i++) {
            int num = A.get(i);
            if (num == -1) {
                root = i;
                continue;
            }
            graph.get(i).add(num);
            graph.get(num).add(i);
        }
        // Find the node which is farthest from root node using BFS
        int node = bfs(graph, n, root);
        // Find the maximum distance from farthest node using modified DFS
        return dfs(graph, n, node);
    }
    public int bfs(ArrayList < ArrayList < Integer >> graph, int n, int u) {
        boolean[] vis = new boolean[n];
        Queue < Integer > q = new LinkedList < Integer > ();
        q.add(u);
        while (!q.isEmpty()) {
            // stores the farthest node from root node
            u = q.remove();
            if (!vis[u]) {
                vis[u] = true;
                for (Integer v: graph.get(u)) {
                    if (!vis[v]) {
                        q.add(v);
                    }
                }
            }
        }
        return u;
    }
    public int dfs(ArrayList < ArrayList < Integer >> graph, int n, int u) {
        int max = 0;
        Stack < Integer > node = new Stack < Integer > ();
        Stack < Integer > dist = new Stack < Integer > ();
        boolean[] vis = new boolean[n];
        node.push(u);
        dist.push(0);
        while (!node.isEmpty()) {
            u = node.pop();
            int d = dist.pop();
            if (!vis[u]) {
                vis[u] = true;
                for (Integer v: graph.get(u)) {
                    if (!vis[v]) {
                        max = Math.max(max, d + 1);
                        node.push(v);
                        dist.push(d + 1);
                    }
                }
            }
        }
        return max;
    }
}