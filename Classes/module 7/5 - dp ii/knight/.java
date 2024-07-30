import java.util.*;

public class Solution {
    private static final int[] rowMoves = {-2, -1, 1, 2, 2, 1, -1, -2};
    private static final int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};
    
    public int knight(int A, int B, int C, int D, int E, int F) {
        if (C == E && D == F) {
            return 0;
        }
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{C, D, 0});
        
        boolean[][] visited = new boolean[A + 1][B + 1];
        visited[C][D] = true;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int curRow = current[0];
            int curCol = current[1];
            int steps = current[2];
            
            for (int i = 0; i < 8; i++) {
                int newRow = curRow + rowMoves[i];
                int newCol = curCol + colMoves[i];
                
                if (newRow == E && newCol == F) {
                    return steps + 1;
                }
                
                if (isValidMove(newRow, newCol, A, B) && !visited[newRow][newCol]) {
                    visited[newRow][newCol] = true;
                    queue.offer(new int[]{newRow, newCol, steps + 1});
                }
            }
        }
        
        return -1;
    }
    
    private boolean isValidMove(int row, int col, int A, int B) {
        return row >= 1 && row <= A && col >= 1 && col <= B;
    }
}
