public class Solution {
    public int solve(String A) {
        int count =0;
        
        for(int i =0;i< A.length(); i++){
            char c = Character.toLowerCase(A.charAt(i));
            if(c =='a' || c == 'e' || c=='i' || c == 'o' || c == 'u'){
                count += A.length() - i;
            }
        }
        return count % 10003;
    }
}
