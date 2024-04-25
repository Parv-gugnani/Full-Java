import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[][] permute(int[] A) {
        List<int[]> result = new ArrayList<>();
        boolean[] used = new boolean[A.length];
        int[] currentPermutation = new int[A.length];
        generatePermutations(result, A, used, currentPermutation, 0);
        return result.toArray(new int[result.size()][]);
    }

    private void generatePermutations(List<int[]> result, int[] A, boolean[] used, int[] currentPermutation, int index) {
        if (index == A.length) {
            result.add(currentPermutation.clone());
            return;
        }

        for (int i = 0; i < A.length; i++) {
            if (!used[i]) {
                currentPermutation[index] = A[i];
                used[i] = true;
                generatePermutations(result, A, used, currentPermutation, index + 1);
                used[i] = false;
            }
        }
    }
}
