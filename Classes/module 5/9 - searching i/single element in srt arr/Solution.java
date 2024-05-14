public class Solution {
    public int solve(ArrayList<Integer> A) {

        int lo =0;
        int hi = A.size() - 1;

        while(lo < hi){
            int mid = lo + (hi - lo) / 2;
            
            if(mid % 2 == 0){
                if(A.get(mid).equals(A.get(mid + 1))){
                    lo = mid + 2;
                }

                else{
                    hi = mid;
                }
            }

            else{
                if(A.get(mid).equals(A.get(mid - 1))){
                    lo = mid + 1;
                }

                else{
                    hi  = mid - 1;
                }
            }
        }

        return A.get(lo);
    }
}
