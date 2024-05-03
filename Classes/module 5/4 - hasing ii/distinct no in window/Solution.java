import java.util.*;

public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        
        if (B > A.size()) {
            return result;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < B; i++) {
            map.put(A.get(i), map.getOrDefault(A.get(i), 0) + 1);
        }
        
        result.add(map.size());
        
        for (int i = B; i < A.size(); i++) {

            int prev = A.get(i - B);
            if (map.get(prev) == 1) {
                map.remove(prev);
            } else {
                map.put(prev, map.get(prev) - 1);
            }
            
            int current = A.get(i);
            map.put(current, map.getOrDefault(current, 0) + 1);
            result.add(map.size());
        }
        
        return result;
    }
}
