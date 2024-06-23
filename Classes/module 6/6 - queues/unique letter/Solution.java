
public class Solution {
    public String solve(String A) {
        StringBuilder result = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();
        int[] charCount = new int[26];
        
        for (char ch : A.toCharArray()) {
            charCount[ch - 'a']++;
            queue.add(ch);
            
            while (!queue.isEmpty() && charCount[queue.peek() - 'a'] > 1) {
                queue.poll();
            }
            
            if (queue.isEmpty()) {
                result.append("#");
            } else {
                result.append(queue.peek());
            }
        }
        
        return result.toString();
    }
}
