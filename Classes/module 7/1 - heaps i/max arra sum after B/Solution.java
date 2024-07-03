import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Collections;

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(A);
        
        for (int i = 0; i < B; i++) {

            int smallest = minHeap.poll();
            minHeap.add(-smallest);
        }

        int sum = 0;
        while (!minHeap.isEmpty()) {
            sum += minHeap.poll();
        }
        
        return sum;
    }
}
