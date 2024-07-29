
public class Solution {
    public int solve(int[][] A, int[] B, int[] C) {
        int N = A.length;
        int M = A[0].length;

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        int[][] distance = new int[N][M];
        for (int[] row : distance) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{B[0], B[1]});
        distance[B[0]][B[1]] = 0;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currX = current[0], currY = current[1];
            
            for (int k = 0; k < 4; k++) {
                int newX = currX, newY = currY;
                int count = 0;
                
                while (newX + dx[k] >= 0 && newX + dx[k] < N && newY + dy[k] >= 0 && newY + dy[k] < M && A[newX + dx[k]][newY + dy[k]] == 0) {
                    newX += dx[k];
                    newY += dy[k];
                    count++;
                }
                
                if (distance[currX][currY] + count < distance[newX][newY]) {
                    distance[newX][newY] = distance[currX][currY] + count;
                    queue.add(new int[]{newX, newY});
                }
            }
        }
        
        return distance[C[0]][C[1]] == Integer.MAX_VALUE ? -1 : distance[C[0]][C[1]];
    }
}
 