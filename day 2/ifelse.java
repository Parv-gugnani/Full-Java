//for loop
import java.util.*;

public class ifelse {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        // int c = scanner.nextInt();

        // // 
        // if ((a >= b && a <= c) || (a <= b && a >= c)) {
        //     System.out.println(a);
        // } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
        //     System.out.println(b);
        // } else {
        //     System.out.println(c);
        // }

        //q 8 additional
        int n = scanner.nextInt();
        int m = scanner.nextInt();



       if(n%m == 0)
       {
           System.out.println(n/m);
        }
        else if(n%m == 1)
        {
           System.out.println(0);

       }

        scanner.close();

        
    }
}