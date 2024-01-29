//Patterns
import java.util.*;

public class patt {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        // Q 1

        // int n = scanner.nextInt();
        // for (int i = 0; i < n; i++) {
        //     System.out.print("*");
        // }

        // Q 2
        // int n = scanner.nextInt();
        // for (int i = 1; i <= n; i++) {
        //    for (int c = 1; c <= n; c++) {
        //     System.out.print("*");
        //    }
        //    System.out.println();
        // }

        // Q 3
        // int n = scanner.nextInt();
        // int m = scanner.nextInt();
        // for (int i = 1; i <= n; i++) {
        //    for (int c = 1; c <= m; c++) {
        //     System.out.print("*");
        //    }
        //    System.out.println();
        // }


        // Q 4
        // int n = scanner.nextInt();
        // for (int i = 1; i <= n; i++) {
        //    for (int c = 1; c <= i; c++) {
        //     System.out.print("*");
        //    }
        //    System.out.println();
        // }

        // Q 5
        // int n = scanner.nextInt();
        // for (int row = 1; row <= n; row++) {
        // for (int col = 1; col <= row; col++) {
        //     if(col%2 == 0) {
        //         System.out.print(col);
        //     }
        //     else{
                
        //         System.out.print("*");

        //     }
        // }
        // System.out.println();
           
        // }


        // Q 6
        // int n = scanner.nextInt();
        // for (int r = 1; r <= n; r++) {
        //     System.out.print("*");
        // for (int s = 1; s <= n-2; s++) {
        //       System.out.print("-");
        // }
        // System.out.print("*");
        // System.out.println();
        // }
        


        // Q 7
        // int n = scanner.nextInt();
        // for (int i = 1; i <= n; i++) {
        //    for (int c = n; c >= i; c--) {
        //     System.out.print("*");
        //    }
        //    System.out.println();
        // }


        //Q 8
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
           for (int c = n; c >= i; c--) {
            System.out.print("*");
           }
           System.out.println();
        }





        scanner.close();
    }
}