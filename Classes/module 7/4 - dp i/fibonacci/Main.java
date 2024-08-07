import java.lang.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] fib = new int[n + 1]; //  fib[i] denotes the i'th fibonacci number
    fib[0] = 0;
    fib[1] = 1;
    for (int i = 2; i <= n; i++)
      fib[i] = fib[i - 1] + fib[i - 2];
    System.out.println(fib[n]);
  }
}