import java.util.*;


public class Solution {
    public String largestNumber(final List<Integer> A) {
        
        String[] arr = new String[A.size()];
        for (int i = 0; i < A.size(); i++) {
            arr[i] = String.valueOf(A.get(i));
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}
