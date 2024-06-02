public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A, new Comparator< Integer >(){
            @Override
            public int compare(Integer val1, Integer val2) {
                Integer tens_digit1 = (val1 / 10 ) % 10;
                Integer tens_digit2 = (val2 / 10 ) % 10;
                if (tens_digit1 == tens_digit2){
                    return val2 - val1;
            	}
                return tens_digit1 - tens_digit2;
            }    
        });
        return A;
    }
}