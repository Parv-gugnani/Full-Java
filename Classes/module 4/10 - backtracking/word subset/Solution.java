import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> universalWords = new ArrayList<>();
        int[] maxFrequency = new int[26];

        for (String word : words2) {
            int[] wordFrequency = new int[26];
            for (char c : word.toCharArray()) {
                wordFrequency[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                maxFrequency[i] = Math.max(maxFrequency[i], wordFrequency[i]);
            }
        }

        for (String word : words1) {
            int[] wordFrequency = new int[26];
            for (char c : word.toCharArray()) {
                wordFrequency[c - 'a']++;
            }
            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (wordFrequency[i] < maxFrequency[i]) {
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) {
                universalWords.add(word);
            }
        }

        return universalWords;
    }
}
