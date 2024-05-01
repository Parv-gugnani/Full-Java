class Solution {
    public int[] productExceptSelf(int[] num) {
        // int left[] = new int[num.length];
        // int right[] = new int[num.length];
        int answer[] = new int[num.length];
        int left = 1;
        int right = 1;

        
            answer[0]=1;
            for(int i = 1; i < num.length;i++){
                left = num[i-1] * left;
                answer[i]=left;

            }

        right= 1;
        // answer[num.length -1] *= right;


            for(int i = num.length-2; i >= 0;i--){
                right = num[i+1] * right;
                answer[i] *= right; 
            }

        

            return answer;
    }
}