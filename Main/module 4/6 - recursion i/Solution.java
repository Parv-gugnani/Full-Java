public class Solution {

    // Q1 print 1 to A
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

    //Q2
    // 1 to n factorial
    public int solve1(int A) {

        if(A == 1) return 1;

        return A * solve1(A-1);
    }

}