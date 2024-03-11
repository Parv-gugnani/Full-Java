//Prefix Sum
import java.util.ArrayList;

public class Main {
    static void fillPrefixSum(int arr[], int n,
     int prefixSum[])
    {
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; ++i)
            prefixSum[i] = prefixSum[i - 1] + arr[i];
    }
    public static void main(String[] args)
    {
        int arr[] = { 10, 4, 16, 20 };
        int n = arr.length;
        int prefixSum[] = new int[n];
       
          // Function call
        fillPrefixSum(arr, n, prefixSum);
        for (int i = 0; i < n; i++)
            System.out.print(prefixSum[i] + " ");
        System.out.println("");
    }
}