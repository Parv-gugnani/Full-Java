import java.util.ArrayList;

public class Solution {
    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        ArrayList<ArrayList<Integer>> moves = new ArrayList<>();
        moveDisks(A, 1, 3, 2, moves);
        return moves;
    }

    private void moveDisks(int n, int fromRod, int toRod, int auxRod, ArrayList<ArrayList<Integer>> moves) {
        if (n == 1) {
            ArrayList<Integer> move = new ArrayList<>();
            move.add(1); // Disk number
            move.add(fromRod); // Start tower
            move.add(toRod); // End tower
            moves.add(move);
            return;
        }
        moveDisks(n - 1, fromRod, auxRod, toRod, moves);
        ArrayList<Integer> move = new ArrayList<>();
        move.add(n); // Disk number
        move.add(fromRod); // Start tower
        move.add(toRod); // End tower
        moves.add(move);
        moveDisks(n - 1, auxRod, toRod, fromRod, moves);
    }
}


// 3 august
/*
 public class Solution {
    public int[][] towerOfHanoi(int A) {
        List<int[]> result = new ArrayList<>();
        movedisk(A , 1 , 3 , 2, result);
        return result.toArray(new int[result.size()][]);
    }

    private void movedisk(int n, int start, int end, int temp, List<int[]> result){
        if(n == 0) return;

        movedisk(n - 1, start, temp, end , result);
        result.add(new int[]{n, start, end});

        movedisk(n-1, temp, end , start, result);
    }
}

 */