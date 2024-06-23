

public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();
        long result = 0;
        int MOD = 1000000007;

        for (int i = 0; i < n; i++) {
            // Remove elements not within the window for both deques
            if (!maxDeque.isEmpty() && maxDeque.peekFirst() < i - B + 1) {
                maxDeque.pollFirst();
            }
            if (!minDeque.isEmpty() && minDeque.peekFirst() < i - B + 1) {
                minDeque.pollFirst();
            }

            // Remove elements from maxDeque smaller than the current element
            while (!maxDeque.isEmpty() && A[maxDeque.peekLast()] <= A[i]) {
                maxDeque.pollLast();
            }

            // Remove elements from minDeque larger than the current element
            while (!minDeque.isEmpty() && A[minDeque.peekLast()] >= A[i]) {
                minDeque.pollLast();
            }

            // Add current element index to both deques
            maxDeque.offerLast(i);
            minDeque.offerLast(i);

            // Start adding to the result once we have the first window
            if (i >= B - 1) {
                result = (result + A[maxDeque.peekFirst()] + A[minDeque.peekFirst()]) % MOD;
            }
        }

        return (int) result;
    }
}
