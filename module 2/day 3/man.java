//Space Complexity assignment

public class Solution {
    public int solve(ArrayList<Integer> A) {
        if (A.isEmpty()) {
            return 0;
        }

        int max = A.get(0);
        int min = A.get(0);


        for (int num : A) {
            if (num > max) {
                max = num; 
            }
            if (num < min) {
                min = num;
            }
        }

        int sum = max + min;
        return sum;
    }
}
