public class Solution {
    public int solve(int A, int[][] B, int C, int D) {
     List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : B) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }
        
        int[] dist = new int[A];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Deque<Integer> deque = new LinkedList<>();
        dist[C] = 0;
        deque.addFirst(C);
        
        while (!deque.isEmpty()) {
            int node = deque.pollFirst();
            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0];
                int weight = neighbor[1];
                if (dist[node] + weight < dist[nextNode]) {
                    dist[nextNode] = dist[node] + weight;
                    if (weight == 1) {
                        deque.addLast(nextNode);
                    } else {
                        deque.addFirst(nextNode);
                    }
                }
            }
        }
        
        return dist[D] == Integer.MAX_VALUE ? -1 : dist[D];
    }
}