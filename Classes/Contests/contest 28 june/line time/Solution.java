public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        Queue<int[]> queue = new LinkedList<>();
        
        for(int i =0; i< n; i++){
            queue.offer(new int[]{i, A[i]});
        }
        
        int time = 0;
        
        while(!queue.isEmpty()){
            int[] person = queue.poll();
            int pos = person[0];
            int ticket = person[1];            

            
            time++;
            
            if(ticket > 1){
                queue.offer(new int[]{pos, ticket - 1});
            }
            else if(pos == B){
                return time;
            }
        }
        
        return time;
    }
}
