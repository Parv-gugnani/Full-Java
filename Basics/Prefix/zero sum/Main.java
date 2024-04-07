
import java.util.*;

public class Main {

    public static void main(String[] args){
    int arr[] = { -3, 2, 3, 1, 6 };
   
 
    // Function call
    if (subArrayExists(arr))
        System.out.println("Found a subarray with 0 sum");
    else
        System.out.println("No Such Sub Array Exists!");
 
}

public static boolean subArrayExists(int[] arr){
    int n = arr.length;
    // int prefix[] = new int[n];
    int prefixsum = 0;
    HashSet<Integer> set = new HashSet<>();

    for(int i = 0 ;i<n;i++){
        prefixsum += arr[i];
        

        if(prefixsum == 0 || arr[i] ==0 || set.contains(prefixsum)){
        return true;
        }
 
        set.add(prefixsum);
    }
    return false;
}
    
    
}
