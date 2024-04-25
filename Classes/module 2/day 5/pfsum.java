//Prefix Sum
import java.util.ArrayList;
import java.util.*;

class pfsum {



    // Q1
    // add the sum
    // static void fillprefix(int arr[],int n, int prefixsum[]){
    //     prefixsum[0] = arr[0];
        
    //     for(int i = 1; i < n; ++i){
    //         prefixsum[i] = prefixsum[i - 1] + arr[i];
    //     }
    // }

    // public static void main(String[] args){
    //     int arr[] = {10,20,30,40,50};
    //     int n = arr.length;
    //     int prefixsum[] = new int[n];

    //     fillprefix(arr, n, prefixsum);

    //     for(int i = 0 ; i < n ;i ++)
    //         System.out.print(prefixsum[i] + " ");
    
    //         System.out.println("");
            
    // }

    // Q2 add from L TO R
    public static void main(String[] args){
        int n = 6;
        int[] a = { 3, 6, 2, 8, 9, 2 };
        int[] pf = new int[n + 2];
        pf[0] = 0;
        for (int i = 0; i < n; i++) {
            pf[i + 1] = pf[i] + a[i];
        }
 
        int[][] q
            = { { 2, 3 }, { 4, 6 }, { 1, 5 }, { 3, 6 } };
        for (int i = 0; i < q.length; i++) {
            int l = q[i][0];
            int r = q[i][1];
 
            System.out.print(pf[r] - pf[l - 1] + "\n");
        }
     }


}