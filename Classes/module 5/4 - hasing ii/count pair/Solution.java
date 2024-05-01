public class Solution {
    public int solve(int A, ArrayList<Integer> B) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : B) {
            int complement = A - num;
            if (set.contains(complement)) {
                return 1;
            }
            set.add(num);
        }
        return 0;
    }
}