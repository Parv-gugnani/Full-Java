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

    public int findAthFibonacci(int A) {
        if (A == 0) return 0;
       if (A == 1) return 1;
       

       return findAthFibonacci(A - 1) + findAthFibonacci(A - 2);
   }


   // Q3 optional - check palindrome

    public int isPalindrome(String A) {
         // Call the recursive helper function to check if A is a palindrome
         return isPalindromeHelper(A, 0, A.length() - 1) ? 1 : 0;
     }
     
     private boolean isPalindromeHelper(String A, int start, int end) {
         if (start >= end) {
             return true;
         }
         
         if (A.charAt(start) != A.charAt(end)) {
             return false;
         }
         
         return isPalindromeHelper(A, start + 1, end - 1);
     }

 

}