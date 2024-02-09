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

    // 
    private static int printspc(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){ 
            char chr = str.charAt(i);
         
            if(chr>='0' && chr<='9'){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){
        String country = "India 25";
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

        printspc

    }
 
    
}
