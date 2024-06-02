public class Solution {
    public int solve(List<Integer> A, int B) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(B, Collections.reverseOrder());
        int n = A.size();
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = A.get(i) + A.get(j) + A.get(k);
                    if (minHeap.size() < B || sum < minHeap.peek()) {
                        minHeap.offer(sum);
                        if (minHeap.size() > B) {
                            minHeap.poll();
                        }
                    }
                }
            }
        }
        
        return minHeap.poll();
    }
}
