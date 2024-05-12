import java.util.*;

public class Solution {
    public int[][] solve(int[][] A, int B) {

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                int distA = a[0] * a[0] + a[1] * a[1];
                int distB = b[0] * b[0] + b[1] * b[1];
                return distA - distB;
            }
        });

        for (int[] point : A) {
            pq.offer(point);
        }


        int[][] result = new int[B][2];
        for (int i = 0; i < B; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}