// 1D array

//Patterns
import java.util.*;

public class man {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Q 1
        // take a arrat size and array elements as an innput form user and print
        
        // int n = scanner.nextInt();
        // int[] arr = new int[n];
        
        // for(int i=0;i<n;i++){
         //     arr[i] = scanner.nextInt();
         // }
         
         // for(int i=0;i<n;i++){
         //     System.out.print(arr[i] + " ");
        // }
                
                
                
        //Q 2
        // take a int array of size N and print its sum
        // int n = scanner.nextInt();
        // int [] arr = new int[n];

        // for(int i=0;i<n;i++){
        //     arr[i] = scanner.nextInt();
        // }
        
        // int sum = 0;
        
        // for(int i=0;i<n;i++){
        //     sum = sum + arr[i];
        // }

        // System.out.println(sum);

        // Q 3
        //take an int arry size n from user print the max element form it

        // int n = scanner.nextInt();
        // int [] arr = new int[n];

        // for(int i=0;i<n;i++){
        //     arr[i] = scanner.nextInt();
        // }

        // int max = arr[0];
        
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        // }
        // System.out.println(max);


        // Q 4
        // take int array of size n as input and prinits min value


        // int n = scanner.nextInt();
        // int [] arr = new int[n];

        // for(int i=0;i<n;i++){
        //     arr[i] = scanner.nextInt();
        // }

        // int min = arr[0];
        
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] < min){
        //         min = arr[i];
        //     }
        // }
        // System.out.println(min);

        // Q 5
        //given a arr check whether k is present or not

        int n = scanner.nextInt();
        int [] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        
        
        System.out.println("enter k");
        int k = scanner.nextInt();
        
        for(int i=0;i<arr.length;i++){
          if(arr[n] == k)
          {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        }
      
        scanner.close();
    }
}