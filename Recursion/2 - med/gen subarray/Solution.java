class Solution{


    static void printsub(int[] arr, int str, int end){

        if(end == arr.length) return;

        else if(str > end)
        //if the starting pt is greater than the ending han we calling the func and which is putting our values and increase the ending
            printsub(arr, str, end + 1);

        else{
            System.out.print("[");
            for(int i = 0; i < end; i++)
                System.out.print(arr[i] + ", ");
            System.out.println(arr[end] + "]");
            printsub(arr, str + 1, end);
        }
        return;
    
    }

    public static void main(int[] arr){
        printsub(arr, 0 , 0);
    }
}