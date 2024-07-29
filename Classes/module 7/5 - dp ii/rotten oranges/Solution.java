import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;
        
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (A[r][c] == 2) {
                    queue.add(new int[]{r, c});
                } else if (A[r][c] == 1) {
                    freshOranges++;
                }
            }
        }
        
        // If there are no fresh oranges, no time is needed to rot them.
        if (freshOranges == 0) {
            return 0;
        }
        
        int minutes = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        // BFS traversal to rot all reachable fresh oranges.
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rottenThisMinute = false;
            
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];
                
                for (int[] direction : directions) {
                    int newRow = row + direction[0];
                    int newCol = col + direction[1];
                    
                    // If the adjacent cell is a fresh orange, rot it.
                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && A[newRow][newCol] == 1) {
                        A[newRow][newCol] = 2;
                        queue.add(new int[]{newRow, newCol});
                        freshOranges--;
                        rottenThisMinute = true;
                    }
                }
            }
            
            // If any orange was rotten this minute, increment the minute counter.
            if (rottenThisMinute) {
                minutes++;
            }
        }
        
        // If there are still fresh oranges left, return -1.
        return freshOranges == 0 ? minutes : -1;
    }
}
