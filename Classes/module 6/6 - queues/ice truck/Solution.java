public class Solution {
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
   ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        
        for (int i = 0; i < A.size(); i++) {
            if (!deque.isEmpty() && deque.peekFirst() == i - B) {
                deque.pollFirst();
            }
            
            while (!deque.isEmpty() && A.get(deque.peekLast()) <= A.get(i)) {
                deque.pollLast();
            }
            
            deque.offerLast(i);
            
            if (i >= B - 1) {
                result.add(A.get(deque.peekFirst()));
            }
        }
        
        return result;
    }
}