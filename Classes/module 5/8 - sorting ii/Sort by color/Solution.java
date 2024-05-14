public class Solution{
    public int[] solve(int[] A){

        int lo =0;
        int mid = 0;
        int hi = A.length - 1;


        while(mid <= hi){
                if(A[mid] == 0){
                    int temp = A[lo];
                    A[lo] = A[mid];
                    A[mid] = temp;
                    lo++;
                    mid++;
                }

                else if(A[mid] == 1){
                    mid++;
                }
                else{
                    int temp = A[mid];
                    A[mid] = A[hi];
                    A[hi] = temp;
                    hi--;
                }
        }


        return A;
    }
}