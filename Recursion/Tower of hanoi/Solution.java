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
