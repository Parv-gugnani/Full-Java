
public class Solution {

    public static void findsub(int[] arr)
    {
        int n = arr.length;

        for (int i = 0; i < (1 << n); i++) {

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args, int n)
    {
        int[] arr = new int[n];
        findsub(arr);
    }
}