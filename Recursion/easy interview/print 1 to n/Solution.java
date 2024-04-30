class Soltion {
    static void printN(int n)
    {
        if (n > 0) {
            printN(n - 1);
            System.out.print(n + " ");
        }
        return;
    }

    public static void main(String[] args)
    {
        int n = 10;
        printN(n);
    }
}