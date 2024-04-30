

public class Solution {
    public void printa(int A){
        if(A==0) return;

        System.out.print(A + " ");
        printa(A - 1);
        
    }

    public void solve(int A){
        printa(A);
        System.out.print("\n");
        
    }
    
}
