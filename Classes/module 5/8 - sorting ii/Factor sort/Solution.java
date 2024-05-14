public class Solution {
    public int[] solve(int[] A) {
        Collection.sort(A, new Comparator<Integer>() {

            public int compare(Integer a, Integer b) {
                int countA = countFactor(a);
                int countB = countFactor(b);
                
                if(countA != countB){
                    return Integer.compare(countA, countB);
                }
                else{
                    return Integer.compare(a, b);
                }
            }
        });

        return A;
    }


    private int countFactor(int num){

        int count = 0;
        for(int i = 1; i * i <= num; i++){
            if(num % i == 0){
                if(i*i == num){
                    count += 1;
                }
                else{
                    count += 2;
                }
            }
        }

        return count;
    }
}
