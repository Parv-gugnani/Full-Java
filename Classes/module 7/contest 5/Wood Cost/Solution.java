public class Solution {
    public long solve(int[] A) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        for(int board: A){
            minHeap.add((long)board);
        }
        
        long totalcost = 0;
        
        while(minHeap.size() > 1){
            long first = minHeap.poll();
            long second = minHeap.poll();
            
            long cost = first+second;
            
            totalcost += cost;
            
            minHeap.add(cost);
        }
        
        return totalcost;
    }
}
