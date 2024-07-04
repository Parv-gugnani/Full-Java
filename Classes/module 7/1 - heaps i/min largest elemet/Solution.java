public class Solution {
    public int solve(int[] A, int B) {
        
        PriorityQueue < Pair > pq = new PriorityQueue(new CustomComp());
        int s = A.length;
        
        int[] state = new int[s];
        for (int i = 0; i < s; i++){
            state[i] = A[i];
        }
        
        for (int i = 0; i < s; i++){
            pq.offer(new Pair(2 * A[i], i));
        }
        
        while(B-- > 0) {
            Pair top = pq.poll();
            
            state[top.ss] = top.ff;
            
            pq.offer(new Pair(A[top.ss] + top.ff, top.ss));
        }
        
        int mx = state[0];
        for (int i = 0; i < s; i++) mx = Math.max(mx, state[i]);
        return mx;
    }
}
class Pair {
    int ff;
    int ss;
    public Pair(int c, int d) {
        this.ff = c;
        this.ss = d;
    }
}
class CustomComp implements Comparator < Pair > {
    @Override
    public int compare(Pair a, Pair b) {
        return a.ff - b.ff;
    }
}