public class Solution {
    public String solve(int A) {
        
        Queue<String> queue = new LinkedList<>();
        
        queue.add("1");
        queue.add("2");
        
        int count = 0;
        
        while (!queue.isEmpty()) {
            String current = queue.poll();
            
            String palindrome = current + new StringBuilder(current).reverse().toString();
            
            count++;
            
            if (count == A) {
                return palindrome;
            }
            
            queue.add(current + "1");
            queue.add(current + "2");
        }
        
        return "";
    }
}