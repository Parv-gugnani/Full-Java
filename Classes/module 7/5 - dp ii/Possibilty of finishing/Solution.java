public class Solution {
    public int solve(int A, int[] B, int[] C) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i =0; i<=A;i++){
            graph.add(new ArrayList<>());
        }

        int[] inDegree = new int[A + 1];

        for(int i=0;i < B.length;i++){
            graph.get(B[i]).add(C[i]);
            inDegree[C[i]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i= 1; i <= A; i++){
            if(inDegree[i] ==0){
                queue.add(i);
            }
        }

        int count = 0;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            count++;
            for(int neb: graph.get(curr)){
                inDegree[neb]--;
                if(inDegree[neb] ==0){
                    queue.add(neb);
                }
            }
        }

        return count == A ? 1 : 0;
    }
}
