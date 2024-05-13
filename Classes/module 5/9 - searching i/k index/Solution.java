import java.util.ArrayList;

public class Solution {
    public int searchInsert(ArrayList<Integer> A, int B) {

        int low = 0;
        int high = A.size() - 1;

        while(low <= high){
            int mid = low  + (high - low) / 2;

            if(A.get(mid) == B){
                return mid;
            } 

            else if(A.get(mid) < B){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }

        return low;
    }
}
