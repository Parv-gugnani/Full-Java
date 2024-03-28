
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        
       Scanner scan = new Scanner(System.in);
       
       int n = scan.nextInt();
       scan.close();
       
       String str = String.valueOf(n);
       
       if(str.equals(String.valueOf(n))){
           System.out.println("Good job");
       }
       else{
           System.out.println("Wrong answer");
       }

      
    }
}

