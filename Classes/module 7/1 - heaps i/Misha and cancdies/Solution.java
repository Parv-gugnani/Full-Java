import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int candies : A) {
            if (candies <= B) {
                minHeap.add(candies);
            }
        }
        
        int totalCandiesEaten = 0;
        
        while (!minHeap.isEmpty()) {
            int minCandies = minHeap.poll();
            
            int candiesEaten = minCandies / 2;
            totalCandiesEaten += candiesEaten;
            
            int remainingCandies = minCandies - candiesEaten;
            
            if (remainingCandies > 0 && remainingCandies <= B) {
                minHeap.add(remainingCandies);
            }
        }
        
        return totalCandiesEaten;
    }
}
