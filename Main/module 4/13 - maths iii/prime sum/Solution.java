import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public ArrayList<Integer> primesum(int A) {
        List<Integer> primes = sieve(A);
        ArrayList<Integer> result = new ArrayList<>();
        for (int prime : primes) {
            int complement = A - prime;
            if (primes.contains(complement)) {
                result.add(prime);
                result.add(complement);
                return result;
            }
        }
        return result;
    }
}
