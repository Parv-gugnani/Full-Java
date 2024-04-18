import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static final String[] digitLetters = {
        "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public String[] letterCombinations(String A) {
        List<String> result = new ArrayList<>();
        if (A == null || A.length() == 0) {
            return new String[0];
        }
        generateCombinations(result, A, "", 0);
        return result.toArray(new String[result.size()]);
    }

    private void generateCombinations(List<String> result, String digits, String current, int index) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        String letters = digitLetters[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(result, digits, current + letters.charAt(i), index + 1);
        }
    }
}
