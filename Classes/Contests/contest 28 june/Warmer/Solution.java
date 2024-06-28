public class Solution {
    public int[] solve(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=n - 1; i>= 0; i--){
            while(!stack.isEmpty() && A[stack.peek()] <= A[i]){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                result[i] = -1;
            }
            else{
                result[i] = A[stack.peek()] - A[i];
            }
            
            stack.push(i);
        }
        return result;
    }
}
