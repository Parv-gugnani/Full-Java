public class Solution {
    public int solve(int A, int B) {
        if(A == 1) return 0;

        int parent = solve(A -1 , B /2);

        if(B %2 == 0) return parent;

        return parent == 0 ? 1 : 0;
    }
}
