//sub array

public class man {


    // Q1 Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array

// public class Solution {
//     public int solve(ArrayList<Integer> A) {
        
//         int min_ele = Integer.MAX_VALUE, max_ele = Integer.MIN_VALUE;   // min and max value of the array
//         int min_Index = -1, max_Index = -1; // index of the last element having value equal to min_ele and max_ele
        
//         int ans = Integer.MAX_VALUE;
//         for(int x : A){
//             min_ele = Math.min(min_ele, x);
//             max_ele = Math.max(max_ele, x);
//         }
        
//         for(int i = 0; i < A.size(); i++){
//             if(A.get(i) == min_ele) min_Index = Math.max(min_Index, i);
//             if(A.get(i) == max_ele) max_Index = Math.max(max_Index, i);
            
//             if(min_Index != -1 && max_Index != -1){
//                 int len = Math.abs(max_Index - min_Index) + 1;
//                 ans = Math.min(ans, len);
//             }
//         }
        
//         return ans;
//     }
// }


//Q2 find the subseq of the AG in string only going from left to right should be calculating g---a
// public class Solution {
//     public int solve(String A) {
//         int MOD = 1000000007;
//         int countA = 0; // Count of 'A' seen so far
//         int countAG = 0; // Count of 'AG' seen so far
//         int ans = 0; // Final answer
        
//         for (char ch : A.toCharArray()) {
//             if (ch == 'A') {
//                 countA++;
//             } else if (ch == 'G') {
//                 countAG = (countAG + countA) % MOD; // Increment countAG by countA
//             }
//         }
        
//         ans = countAG;
//         return ans;
//     }
// }


    
}
