//String
import java.util.*;

public class man {

    private static void printCharByChar(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }

    
    private static void printascii(String str){
        for(int i=0;i<str.length();i++){ 
            char chr = str.charAt(i);
            int code = chr;
            System.out.println(code); 
            // System.out.println((int)chr); 
        }
    }
    // 
    private static int printup(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){ 
            char chr = str.charAt(i);
            // if(chr>=65 && chr<=90){
            //     count++;
            // }
            if(chr>='0' && chr<='9'){
                count++;
            }
        }
        return count;
    }

    private static String printrev(String str){
        String result = "";
        for(int i=str.length()-1;i>=0;i--){
            result += str.charAt(i);
        }
        return result;
    }
    // 
    private static boolean tellpal(String str){
       String printrev = reverse(str);
       if(str.equals(printrev)) {
        return true;
       }
        
    }

    // 
    private static String printspc(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){ 
            char chr = str.charAt(i);
    
            if(
                !(chr>='0' && chr<='9') && !(chr>='a' && chr<='z') && !(chr>='A' && chr<='Z')
            ){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){
        String country = "India 25 @#%$";
        //"India"

        //length of string : length()
        // System.out.println(country.length());
        
        //Index
        // System.out.println(country.charAt(4));

        //Q1
        //output:
        // I
        // n
        // d
        // i
        // a
        // printCharByChar(country + " " );

        //Q2
        //given  a string print ASCII of its characters in new line
        // string : "India"
        // 73
        // 110
        // 100
        // 105
        // 97
        // hint: java understand char as number
        // printascii(country + " " );


        // Q3
        //given a string print Uppercase characer
        // string : "PARV gugnani"
        // out : 4
        // printup("This is counting" + country);

        // Q4 given a astring count the special char
        // string : $%^&*()_)@pweojsmfiopip
       //  System.out.println(printspc("hey $%^"));

       // Q5 given a string return reverse of string
       //in: Parv
       // out : vraP
    //    System.out.println(printrev("Parv"));
    
    //Q 6 given a string tell me it is a palindrome
    //    System.out.println(tellpal("LooL"));
    // }
 

    //Assigment

        //Q1
        // take n no of string 
        // print the lenght of the n number of string by their line
        /*

        import java.util.Scanner;

        public class Main {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }

        for (String str : strings) {
            System.out.println(str.length());
        }

        scanner.close();
    }
}

         */

         //Q2
         // make smallcase to uppercase
         
    //     public class Solution {
    //     public String solve(String S) {

    //     String uppercaseS = S.toUpperCase();
        
    //     return uppercaseS;
    //    }
    //  }

    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past
    // hello from past


    //Q3 is palindrome
    /*
     public static boolean isPalin(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
     */
          

    }
    
}
