//watched solution

import java.util.*;

public class Solution {
    boolean isPerfectSquare(int n) {
        int m = (int) Math.sqrt(n) - 2;
        while (1L * m * m < n) m++;
        return m * m == n;
    }
    public int solve(int[] A) {
        HashMap < Integer, Integer > count = new HashMap < > ();
        int N = A.length;
        for (int i = 0; i < N; i++) {
            count.put(A[i], count.getOrDefault(A[i], 0) + 1);
        }
        HashMap < Integer, HashSet < Integer >> graph = new HashMap < > ();
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (isPerfectSquare(A[i] + A[j])) {
                    // add an edge from i to j and j to i
                    HashSet < Integer > set = graph.getOrDefault(A[i], new HashSet < Integer > ());
                    if (!set.contains(A[j])) {
                        set.add(A[j]);
                        graph.put(A[i], set);
                    }
                    set = graph.getOrDefault(A[j], new HashSet < Integer > ());
                    if (!set.contains(A[i])) {
                        set.add(A[i]);
                        graph.put(A[j], set);
                    }
                }
            }
        }
        ArrayList < ArrayList < Integer >> res = new ArrayList < > ();
        for (int i: count.keySet()) {
            backtrack(graph, count, N, i, new ArrayList < Integer > (), res);
        }
        return res.size();
    }

    public void backtrack(HashMap < Integer, HashSet < Integer >> graph, Map < Integer, Integer > count, int N, int value,
        List < Integer > temp, ArrayList < ArrayList < Integer >> res) {
        if (count.get(value) == 0)
            return;
        if (!graph.containsKey(value))
            return;
        count.put(value, count.get(value) - 1);
        temp.add(value);
        if (temp.size() == N) {
            res.add(new ArrayList < Integer > (temp));
        } else {
            for (int i: graph.get(value)) {
                // traverse all adjacent vertices
                backtrack(graph, count, N, i, temp, res);
            }
        }
        temp.remove(temp.size() - 1);
        count.put(value, count.get(value) + 1);
    }
}