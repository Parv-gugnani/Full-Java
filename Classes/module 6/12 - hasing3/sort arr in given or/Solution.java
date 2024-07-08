import java.util.*;

public class Solution {
    public int[] solve(int[] A, int[] B) {
        // Step 1: Count the occurrences of each element in A
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : A) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Create a list to store the sorted elements
        List<Integer> result = new ArrayList<>();
        
        // Step 3: Add elements to result list based on B
        for (int num : B) {
            if (countMap.containsKey(num)) {
                int count = countMap.get(num);
                for (int i = 0; i < count; i++) {
                    result.add(num);
                }
                countMap.remove(num);
            }
        }
        
        // Step 4: Collect remaining elements, sort them, and add to result list
        List<Integer> remainingElements = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                remainingElements.add(num);
            }
        }
        
        Collections.sort(remainingElements);
        result.addAll(remainingElements);
        
        // Convert the result list to an array
        int[] sortedArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            sortedArray[i] = result.get(i);
        }
        
        return sortedArray;
    }
}
