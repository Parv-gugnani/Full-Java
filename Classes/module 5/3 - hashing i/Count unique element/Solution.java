import java.util.*;

public class Solution {
    public int solve(int[] A){
        HashMap<Integer, Integer> map = new HashMap<>();
        

        for(int num: A){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int uniquecount =0;

        for(int num: A){
            if (map.get(num) == 1) {
                uniquecount++;
            }
        }

        return uniquecount;
    }
}
