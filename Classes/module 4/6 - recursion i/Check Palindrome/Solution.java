
public class Solution {

    public int solve(String A){
        return isPalin(A, 0, A.length() -1) ? 1 : 0;
    }

    private boolean isPalin(String A, int start, int end){
        if(start >= end){
            return true;
        }

        if(A.charAt(start) != A.charAt(end)){
            return false;
        }

        return isPalin(A, start + 1, end - 1);
    }

    
}
