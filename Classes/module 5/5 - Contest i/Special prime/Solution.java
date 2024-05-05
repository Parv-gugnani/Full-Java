public class Solution {
    public int[] solve(int A, int B) {
        
        List<Integer> result = new ArrayList<>();
        
        for(int i = A; i <= B; i++){
            if(isPrime(i) && lastdig(i) == 3){
                result.add(i);
            }
        }
        
        int[] specialprime = new int[result.size()];
        for(int i =0; i< result.size(); i++){
            specialprime[i] = result.get(i);
        }
        
        return specialprime;
    }
    
    public boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if( n % i == 0 ){
                return false;
            }
        }    
        return true;
        
    }
    
    public static int lastdig(int n){
        return(n % 10);
    }

    public static void main(String[] args){
        solve(1, 2);
    }
}