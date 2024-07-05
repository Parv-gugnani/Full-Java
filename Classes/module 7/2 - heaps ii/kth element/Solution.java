import java.util.PriorityQueue;

public class Solution {
    public int solve(int[][] A, int B) {
        int N = A.length;
        int M = A[0].length;
        
        PriorityQueue<Element> minHeap = new PriorityQueue<>((e1, e2) -> e1.value - e2.value);
        
        for (int i = 0; i < N; i++) {
            minHeap.offer(new Element(A[i][0], i, 0));
        }
        
        for (int i = 1; i < B; i++) {
            Element minElement = minHeap.poll();
            int row = minElement.row;
            int col = minElement.col;
            
            if (col + 1 < M) {
                minHeap.offer(new Element(A[row][col + 1], row, col + 1));
            }
        }
        
        return minHeap.peek().value;
    }

    private static class Element {
        int value;
        int row;
        int col;

        Element(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }
}
