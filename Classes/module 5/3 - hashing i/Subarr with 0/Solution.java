import java.util.*;

public class Solution {
    public int solve(ArrayList<Integer> A){

        HashSet <Long> set = new HashSet<Long>();
        long sum =0;
        set.add(sum);
        
        for(int x:A){
            sum += x;

            if(set.contains(sum)) return 1;
            else{
                set.add(sum);
            } 
                
        }
        return 0;
    }
}
