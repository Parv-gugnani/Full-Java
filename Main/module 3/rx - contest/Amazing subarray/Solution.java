public class Solution {
    public int solve(String A) {
        int count =0;
        int mod =10003;
        
        for(int p =0;p< A.length(); p++){
            char ch = A.charAt(p);
            // char c = Character.toLowerCase(A.charAt(p));
            // if(c =='a' || c == 'e' || c=='i' || c == 'o' || c == 'u'){
            //     count += A.length() - p;
            // }
            
            if(isVowel(ch)){
                count = (count + A.length() -p) % mod;
            }
            
        }
        return count ;
    }
    
    
    private boolean isVowel(char ch){
        return ch =='a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u' || ch =='A' || ch =='E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
