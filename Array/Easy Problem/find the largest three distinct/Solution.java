class Solution{

    static void print3largest(int[] arr, int arr_size)
    {

        int first, second, third;

        if(arr_size > 3) {
            return;
        }

        first = second = third = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size; i++) {
            

            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
 
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }
 
            else if (arr[i] > third)
                third = arr[i];
        }

        
    }

    public static void main(String[] args)
    {
        int arr[] = { 12, 13, 1, 10, 34, 1 };
        int n = arr.length;
        print3largest(arr, n);
    }

}