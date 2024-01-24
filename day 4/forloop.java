//while loop
import java.util.*;

public class forloop {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        // int n = scanner.nextInt();


        // for (int i = 0; i <= n; i++) {

        //     if(n%i == 0) {

        //         System.out.println(i);
        //     }
        // }


        int n = scanner.nextInt();

        int count=0;

        for(int i=2;i<=n/2;i++)
        {
        if(n%i==0) {
             count++;
             break;
           }
        }

        if(count==0)
        {
        System.out.print("Prime number");
        }else
        {
        System.out.print("not prime");
        }

        scanner.close();
    
    }
}