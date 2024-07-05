public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> leftHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> rightHeap = new PriorityQueue<>();
        
        for (int num : A) {
            if (leftHeap.isEmpty() || num <= leftHeap.peek()) {
                leftHeap.offer(num);
            } else {
                rightHeap.offer(num);
            }
            
            if (leftHeap.size() > rightHeap.size() + 1) {
                rightHeap.offer(leftHeap.poll());
            } else if (rightHeap.size() > leftHeap.size()) {
                leftHeap.offer(rightHeap.poll());
            }
            
            if (leftHeap.size() >= rightHeap.size()) {
                result.add(leftHeap.peek());
            } else {
                result.add(rightHeap.peek());
            }
        }
        
        return result;
    }
}