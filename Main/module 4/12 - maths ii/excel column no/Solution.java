public class Solution {
    public int titleToNumber(String A) {
        int result = 0;
        int n = A.length();

        for (int i = 0; i < n; i++) {
            char c = A.charAt(i);
            int numericalValue = c - 'A' + 1;
            result += numericalValue * Math.pow(26, n - i - 1);
        }

        return result;
    }
}
