public class Solution {
    private boolean[] isprime = new boolean[50001];
    public int solve(int A) {
        sieve();
        int[] cnt = new int[50001];
        for (int i = 0; i < 50001; i++)
            cnt[i] = 0;
        for (int i = 1; i <= A; i++) {
            for (int j = 1; j * j <= i; j++) {
                // Check to increment count of distinct primes
                if (i % j == 0) {
                    if (isprime[j]) {
                        cnt[i]++;
                    }
                    if ((i / j) != j && isprime[i / j]) {
                        cnt[i]++;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= A; i++) {
            // Increment count for every lucky num
            if (cnt[i] == 2) {
                ans++;
            }
        }
        return ans;
    }

    public void sieve() {
        //Sieve of Eratosthenes
        for (int i = 0; i < 50001; i++)
            isprime[i] = true;
        isprime[1] = false;
        for (long i = 2; i <= 50000; i++) {
            if (isprime[(int) i]) {
                for (long j = i * i; j <= 50000; j += i) {
                    isprime[(int) j] = false;
                }
            }
        }
    }
}