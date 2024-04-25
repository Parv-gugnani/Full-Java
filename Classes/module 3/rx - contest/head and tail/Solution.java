public class Solution {
    public int solve(String A) {
        int maxstr =0;
        int curr =0;
        
        for(int i =0;i < A.length(); i++){
            if(A.charAt(i) == '1'){
                curr++;
                maxstr = Math.max(maxstr, curr);
            }
            else{
                curr =0;
            }
        }
        
        return maxstr;
    }
}
