public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < n;i++){
            while(!stack.isEmpty() && A[i] < A[stack.peek()]){
                int prevday = stack.pop();
                result[prevday] = i - prevday;
            }
            
            stack.push(i);
        }
        
        return result;
    }
}
