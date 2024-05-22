public class Solution {
    public int solve(int[] A, int B) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> pairs = new HashSet<>();
        
        for (int num : A) {
            if (seen.contains(num - B)) {
                pairs.add(num - B);
            }
            if (seen.contains(num + B)) {
                pairs.add(num);
            }
            seen.add(num);
        }
        
        return pairs.size();
    }
}
