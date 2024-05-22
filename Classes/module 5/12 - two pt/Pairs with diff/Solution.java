public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = A.size();
        int sum = 0, start = 0;
        
        for (int i = 0; i < n; i++) {
            sum += A.get(i);
            
            while (sum > B && start < i) {
                sum -= A.get(start);
                start++;
            }
            
            if (sum == B) {
                for (int j = start; j <= i; j++) {
                    result.add(A.get(j));
                }
                return result;
            }
        }
        
        result.add(-1);
        return result;
    
    }
}
