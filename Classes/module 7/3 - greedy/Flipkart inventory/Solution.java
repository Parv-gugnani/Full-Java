import java.util.*;

public class Solution {
    public int solve(int[] A, int[] B) {
        int n = A.length;
        int mod = 1000000007;
        
        class Pair {
            int deadline, profit;
            Pair(int d, int p) {
                this.deadline = d;
                this.profit = p;
            }
        }
        
        List<Pair> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            items.add(new Pair(A[i], B[i]));
        }
        
        Collections.sort(items, (a, b) -> a.deadline - b.deadline);
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        int time = 0;
        
        for (Pair item : items) {
            if (time < item.deadline) {
                minHeap.add(item.profit);
                time++;
            } else if (!minHeap.isEmpty() && minHeap.peek() < item.profit) {
                minHeap.poll();
                minHeap.add(item.profit);
            }
        }
        
        long totalProfit = 0;
        while (!minHeap.isEmpty()) {
            totalProfit = (totalProfit + minHeap.poll()) % mod;
        }
        
        return (int) totalProfit;
    }
}
