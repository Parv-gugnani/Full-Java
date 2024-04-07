package Basics.Prefix.basic;

public class Main {

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        
        // Prefix(arr);    

        System.out.print(Prefix(arr));
        
        

    }
    
public static int[] Prefix(int[] arr){
    int n = arr.length;

    int prefix[] = new int[n];

    for(int i = 0; i < n; i++){
        prefix[i] += arr[i];
    }
    return prefix;

}    
}
