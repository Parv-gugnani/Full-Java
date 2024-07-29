public class Solution {
    public int[] solve(int A, int[][] B) {
        // Initialize in-degree array and adjacency list
        int[] inDegree = new int[A + 1];
        List<Integer>[] adjList = new ArrayList[A + 1];
        
        for (int i = 1; i <= A; i++) {
            adjList[i] = new ArrayList<>();
        }
        
        // Build the graph
        for (int[] edge : B) {
            int from = edge[0];
            int to = edge[1];
            adjList[from].add(to);
            inDegree[to]++;
        }
        
        // Priority queue for lexicographically smallest order
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        // Add all nodes with zero in-degree
        for (int i = 1; i <= A; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }
        
        List<Integer> topologicalOrder = new ArrayList<>();
        
        // Process the queue
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topologicalOrder.add(node);
            
            for (int neighbor : adjList[node]) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }
        
        // Check if topological sorting is possible (i.e., no cycle)
        if (topologicalOrder.size() != A) {
            return new int[0];
        }
        
        // Convert result to array
        int[] result = new int[A];
        for (int i = 0; i < A; i++) {
            result[i] = topologicalOrder.get(i);
        }
        
        return result;
    }
}
