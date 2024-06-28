public class Solution {
    public int solve(ArrayList<Integer> A) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(A);
        int totalCost = 0;

        while (minHeap.size() > 1) {
            int first = minHeap.poll();
            int second = minHeap.poll();
            int cost = first + second;
            totalCost += cost;
            minHeap.offer(cost);
        }

        return totalCost;
    }
}