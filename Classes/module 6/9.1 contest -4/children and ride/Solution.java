public class Solution {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        
        int left = 0;
        int right = A.length - 1;
        int rides = 0;
        
        while(left <= right)
        {
            if(A[left] + A[right] <= B){
                left++;
            }
            
            right--;
            rides++;
        }
        
        return rides;
    }
}