public class Solution {
    public String convertToTitle(int A) {

         StringBuilder result = new StringBuilder();
         //StringBuilder in Java is a class used to create a mutable, or in other words, 
         //a modifiable succession of characters

    
        while(A > 0){
            int rem = (A - 1) % 26;
            char ch = (char) ('A' + rem);

            result.insert(0, ch);
            A = (A - 1)/26;
        }

        return result.toString();
    
    }
}
