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

        // int n = scanner.nextInt();
        // int [] arr = new int[n];

        // for(int i=0;i<n;i++){
        //         arr[i] = scanner.nextInt();
        //     }
        
        // System.out.println("enter k");
        // int k = scanner.nextInt();
        // // 
        // boolean falg = false;
        
        // for(int i=0;i<n;i++){
        //     if(arr[i]==k){
        //         falg = true;
        //         break;
        //     }
        // }
        // if(falg==false){
        // System.out.println("false");
        // }
        // else{
        // System.out.println("true");
        // }


        // Q 6
        // given an array as input return the frequency of k in the arary
        // 1 2 2 2 6 / k = 3 

        
        // int n = scanner.nextInt();
        // int [] arr = new int[n];
        
        // for(int i=0;i<n;i++){
        //     arr[i] = scanner.nextInt();
        // }
        
        // System.out.println("enter k :");
        // int k = scanner.nextInt();
        //  int m =0;
        
        // for(int i=0;i<n;i++){
        //     if(arr[i]==k){
        //         m++;
        //     }
        // }
        // System.out.println("present k in this array are: "+ m);



        // Q 7
        // given arr as int return the fequency of count of an array
        // 1 1 2 1 3 4 2 1 
        // 4 4 2 4 1 1 2 4
        // freq of 1 = 4 
        // freq of 2 = 2 
        // freq of 3 = 1 


        // int n = scanner.nextInt();
        // int [] arr = new int[n];
        
        // for(int i=0;i<n;i++){
        //     arr[i] = scanner.nextInt();
        // }
        
        // System.out.println("enter k :");
        // int k = scanner.nextInt();
        //  int m =0;
        
        // for(int i=0;i<n;i++){
        //     if(arr[i]==k){
        //         m++;
        //     }
        // }
        // System.out.println("present k in this array are: "+ m);

        // Q 8
        // given arr , check wather it is stictly increasing or not
        // 0,2,2,6,7,8 = false
        // 1,2,3,4,5,6 = true


        // assingments
        // Q 1 input arr of [n] reverse oder where print is reverse

        // int n = scanner.nextInt();
        // int [] arr = new int[n];

        // for(int i=0;i<n;i++){
        //     arr[i] = scanner.nextInt();
        // }
        
        // for (int i = n - 1; i >= 0; i--) {
        //     System.out.print(arr[i] + " ");
        // }


        // Q 2 
        // 
        // 
        // 
        // 

       


        // Q 3 max and min 

        // int n = scanner.nextInt();
        // int [] arr = new int[n];

        // for(int i=0;i<n;i++){
        //     arr[i] = scanner.nextInt();
        // }
        
        // int max = arr[0];
        // int min = arr[0];
        
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] > max){
        //         max = arr[i];
        //     }
        //         if(arr[i] < min){
        //             min = arr[i];
        //         }
        // }
        // System.out.println(max);
        // System.out.println(min);



        // Q 4 sum
        int n = scanner.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        
        int sum = 0;
        
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }

        System.out.println(sum);
        
        
        
      
        scanner.close();
    }
}