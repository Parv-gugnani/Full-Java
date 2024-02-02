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

        // output

        /*
        *---*
        *---*
        *---*
        *---*
        *---*
         */
        


        // Q 7
        // ****
        // ***
        // **
        // *
        // int n = scanner.nextInt();
        // for (int r = 1; r <= n; r++) {
        // for (int s = 1; s <= n+1-r; s++) {
        //     System.out.print("*");
        // }
        //    System.out.println();
        // }


        //Q 8
        // *---*
        // *--*
        // *-*
        // **
        // int n = scanner.nextInt();
        // for (int r = 1; r <= n; r++) {
        //     System.out.print("*");
        //    for (int space = 1 ; space <= n-r; space++) {
        //     System.out.print("-");
        // }
        //    System.out.print("*");
        //    System.out.println();
        // }

        //Q 9
        // --*
        // -**
        // ***
        //    int n = scanner.nextInt();
        //   for(int r = 1; r <= n; r++) {
        //     for(int space = 1;space<=n-r;space++){
        //         System.out.print(" ");
        //     }
        //     for(int star = 1; star<=r; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        //   }

        // Q 10
        // ********
        // ***--***
        // **----**
        // *------*
        // int n =scanner.nextInt();
        // for(int r = 1; r<=n;r++){
        //     for(int star =1 ;star<=n+1-r;star++){
        //         System.out.print("*");
        //     }
        //     for(int space = 1;space<=2*(r-1);space++){
        //         System.out.print("-");
        //     }
        //     for(int star2 = 1; star2<=n+1-r;star2++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Q 11
        //--*--
        //-***-
        //*****
        // int n = scanner.nextInt();
        
        // for(int row = 1; row <= n; row++) {
        //     for(int space = 1; space <= n - row; space++) {
        //         System.out.print(" ");
        //     }
        //     for(int star = 1; star <= 2 * row - 1; star++) {
        //         System.out.print("*");
        //     }
        //     System.out.println(); 
        // }


        // Q 12 
        //1234
        //123
        //12
        //1
        // int n = scanner.nextInt();
        // for (int r = 1; r <= n; r++) {
        //     for (int c = 1; c <= n + 1 - r; c++) {
        //         System.out.print(c);
        //         if (c < n + 1 - r) {
        //             System.out.print(" "); // Add a space if it's not the last number in the row
        //         }
        //     }
        //     System.out.println();
        // }



        scanner.close();
    }
}