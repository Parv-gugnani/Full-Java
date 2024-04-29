public class Solution {
    public void print1toA(int A){
        if(A == 0){
            return;
        }
        print1toA(A - 1);// 1 to the A-1 
        System.out.print(A + " ");
    }

    public void solve(int A) {
        print1toA(A);
        System.out.print("\n");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solve(10); // Change 5 to any desired value
    }
}
