import java.util.*;

public class Solution {
    public int solve(int[] A) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : A) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
            return -1;
        }
    }
}