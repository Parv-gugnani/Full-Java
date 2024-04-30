class Solution {
    static void printNos(int n)
    {
        if (n > 0) {
            System.out.print(n + " ");
            printNos(n - 1);
        }
        return;
    }

    public static void main(String[] args)
    {
        int n = 10;
        printNos(n);
    }
}