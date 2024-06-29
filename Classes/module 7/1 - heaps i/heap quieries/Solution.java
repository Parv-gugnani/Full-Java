public class Solution {
    public int[] solve(int[][] A) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        List<Integer> result = new ArrayList<>();

        for (int[] query : A) {
            int P = query[0];
            int Q = query[1];

            if (P == 1) {
                if (minHeap.isEmpty()) {
                    result.add(-1);
                } else {
                    result.add(minHeap.poll());
                }
            } else if (P == 2) {
                minHeap.offer(Q);
            }
        }

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}