public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int xor =0;

        for(int num:A){
            xor ^= num;
        }

        int setBit = xor & -xor;
        int num1 =0, num2=0;

        for(int num :A){
            if((num & setBit) == 0){
                num1 ^= num;
            }else{
                num2 ^= num;
            }
        } 


          ArrayList<Integer> result = new ArrayList<>();
        result.add(num1);
        result.add(num2);
        Collections.sort(result);
        
        return result;
    }
}
