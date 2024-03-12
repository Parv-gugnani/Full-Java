import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public int solve(ArrayList<Integer> A) {
        
        Collections.sort(A);
        
        int sum = 0, ans = 0;
        
        for(int i=0;i<A.size();i++) 
        {
            sum += (A.size()-i)*A.get(i);
        }
        
        return sum;
    }
}


// import java.util.ArrayList;
// import java.util.HashMap;

// public class Solution {
//     public int solve(ArrayList<Integer> A) {
//         HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
//         for (int num : A) {
//             frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
//         }
        
//         for (int num : A) {
//             int countGreaterThanP = 0;
//             for (int otherNum : A) {
//                 if (otherNum > num) {
//                     countGreaterThanP++;
//                 }
//             }
//             if (countGreaterThanP == num) {
//                 return 1;
//             }
//         }
    
//         return -1;
//     }
// }
