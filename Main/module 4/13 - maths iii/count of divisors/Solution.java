import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : A) {
            int divisorsCount = countDivisors(num);
            result.add(divisorsCount);
        }
        return result;
    }

    private int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
