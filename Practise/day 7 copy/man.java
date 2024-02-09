//String
import java.util.*;

public class man {

    private static void printCharByChar(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args){
        String country = "India";
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
        printCharByChar(country);

        //Q2
        //given  a string print ASCII of its characters in new line
        // string : "India"
        // 73
        // 110
        // 100
        // 105
        // 97
        // hint: java understand char as number

    }
 
    
}
