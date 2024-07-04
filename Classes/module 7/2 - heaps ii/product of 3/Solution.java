import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int i = 0; i < n; i++) {
            int num = A.get(i);
            minHeap.offer(num);
            
            if (minHeap.size() > 3) {
                minHeap.poll();
            }
            
            if (i < 2) {
                result.add(-1);
            } else {
                // Convert the minHeap to an array for easier calculation of the product
                Integer[] largestThree = minHeap.toArray(new Integer[0]);
                int product = 1;
                for (int value : largestThree) {
                    product *= value;
                }
                result.add(product);
            }
        }
        
        return result;
    }
}
