public class Solution {
    public int solve(String A) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        for(char c : A.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        int oddCount =0;
        
        for(int count : charCount.values()){
            if(count % 2 != 0){
                oddCount++;
            }
        }
        
        if(oddCount > 1 ){
            return 0;
        }
        
        return 1;
    }
}
