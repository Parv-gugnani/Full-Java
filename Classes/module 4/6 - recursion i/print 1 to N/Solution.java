public class Solution {
    public void print1toA(int A){
        if(A == 0){
            return;
        }
        //return nothing becuase it will break the loop
        print1toA(A - 1);
        System.out.print(A + " ");
    }
    public void solve(int A) {
        print1toA(A);
        System.out.print("\n");
    }
    
}
