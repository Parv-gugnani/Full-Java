

// Q1 - intersection of two array
public class Solution {
    public int[] solve(int[] A, int[] B) {
        
        if (A.length > B.length) {
            return solve(B, A);
        }

        Set<Integer> setA = new HashSet<>();
        for (int num : A) {
            setA.add(num);
        }
        
        Set<Integer> resultSet = new HashSet<>();
        for (int num : B) {
            if (setA.contains(num)) {
                resultSet.add(num);
            }
        }
        
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }
        
        return result;
    }
}




// Q2 - String Acronym
public class Solution {
    public int solve(String[] A, String B) {
        
        if(A.length != B.length()){
            return 0;
        }
        
        for(int i = 0; i < A.length; i++){
            if(A[i].charAt(0)!= B.charAt(i)){
                return 0;
            }
        }
        
        return 1;
    }
}
