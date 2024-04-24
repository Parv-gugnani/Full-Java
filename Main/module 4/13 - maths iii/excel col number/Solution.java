public class Solution {
    public int titleToNumber(String A) {
        int columnNumber = 0;
        int base = 1;

        for (int i = A.length() - 1; i >= 0; i--) {

            int contribution = A.charAt(i) - 'A' + 1;

            columnNumber += contribution * base;

            base *= 26;
        }

        return columnNumber;
    }
}
