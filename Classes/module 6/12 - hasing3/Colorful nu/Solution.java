
public class Solution {
    public int colorful(int A) {
        // Convert the number to a list of digits
        List<Integer> digits = new ArrayList<>();
        while (A > 0) {
            digits.add(A % 10);
            A /= 10;
        }
        Collections.reverse(digits);
        
        // Set to store the products of all subsequences
        Set<Integer> productSet = new HashSet<>();
        
        int n = digits.size();
        
        // Generate all possible subsequences
        for (int length = 1; length <= n; length++) {
            for (int i = 0; i <= n - length; i++) {
                int product = 1;
                for (int j = 0; j < length; j++) {
                    product *= digits.get(i + j);
                }
                // If product is already in the set, it's not a colorful number
                if (productSet.contains(product)) {
                    return 0;
                }
                productSet.add(product);
            }
        }
        
        // If no products are repeated, it's a colorful number
        return 1;
    }
}
