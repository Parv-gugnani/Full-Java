public class Solution {
    public int[] solve(int[] A, int B) {
       Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i< B;i++){
            queue.offer(A[i]);
        }

        for(int i =0; i< B; i++){
            stack.push(queue.poll());
        }

        while(!stack.isEmpty()){
            queue.offer(stack.pop());
        }

        for(int i = B; i< A.length; i++){
            queue.offer(A[i]);
        }

        int[] result = new int[A.length];

        for(int i =0; i< A.length; i++){
            result[i] = queue.poll();
        }

        return result;
    }
}
