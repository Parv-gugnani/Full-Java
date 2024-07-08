

public class Solution {
    public int lengthOfLongestSubstring(String A) {
        int n = A.length();
        int maxLength = 0;
        int i = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int j = 0; j < n; j++) {
            char currentChar = A.charAt(j);
            if (map.containsKey(currentChar)) {
                i = Math.max(map.get(currentChar) + 1, i);
            }
            map.put(currentChar, j);
            maxLength = Math.max(maxLength, j - i + 1);
        }
        
        return maxLength;
    }
}
