import java.util.PriorityQueue;

public class Solution {
    public int[] solve(int A, int[] B) {
        int N = B.length;
        int[] result = new int[N];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            minHeap.offer(B[i]);
            
            if (minHeap.size() < A) {
                result[i] = -1;
            } else {
                if (minHeap.size() > A) {
                    minHeap.poll();
                }
                result[i] = minHeap.peek();
            }
        }

        return result;
    }
}