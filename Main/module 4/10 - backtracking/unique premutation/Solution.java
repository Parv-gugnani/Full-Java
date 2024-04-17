import java.util.*;


public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collections.sort(A);
        genPrem(result, A, new ArrayList<>(), new boolean[A.size()]);
        return result;
    }

    private void genPrem(ArrayList<ArrayList<Integer>> result , ArrayList<Integer> A, ArrayList<Integer> curr, boolean[] used){

        if(curr.size() == A.size()){
            result.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<A.size();i++){

            if(used[i] || (i > 0 && A.get(i).equals(A.get(i -1)) && !used[i - 1])){
                continue;
            }

            curr.add(A.get(i));
            used[i] = true;
            genPrem(result, A, curr, used);
            used[i] = false;
            curr.remove( curr.size() - 1);

        }
   
    }
       
}
