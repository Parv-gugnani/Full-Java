import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        generateSubsets(A, new ArrayList<>(), result, 0);
        return result;
    }

    private void generateSubsets(ArrayList<Integer> A, ArrayList<Integer> subset,
                                 ArrayList<ArrayList<Integer>> result, int index) {
        result.add(new ArrayList<>(subset));

        for (int i = index; i < A.size(); i++) {

            subset.add(A.get(i));

            generateSubsets(A, subset, result, i + 1);

            subset.remove(subset.size() - 1);
        }
    }
}