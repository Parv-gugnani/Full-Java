//best time to sell and buy stocks
/*
 * public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        
        for(int price : A){
            if(price < minprice){
                minprice = price;
            }
            
            int profit = price - minprice;
            
            if(profit > maxprofit){
                maxprofit = profit;
            }
        }
        
        return maxprofit;
    }
}

 */


//longest substring without repeat
/*public class Solution {
    public int lengthOfLongestSubstring(String A) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int nuc = 0;
        int left = 0;
        
        for(int r = 0; r < A.length(); r++){
            char currchar = A.charAt(r);
            
            if(map.containsKey(currchar)){
                left = Math.max(left, map.get(currchar) + 1);
            }
            
            map.put(currchar, r);
            
            nuc = Math.max(nuc, r  - left + 1);
        }
        
        return nuc;
    }
}
 */



//alice and park
/*
 * public class Solution {
    public int solve(int A, int[][] B) {
        
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0 ;i <= A; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] bridge : B){
            int u = bridge[0];
            int v = bridge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        int[] distance = new int[A + 1];
        Arrays.fill(distance, -1);
        Queue<Integer> queue = new LinkedList<>();
        
        
        queue.add(1);
        distance[1] = 0;
        
        while(!queue.isEmpty()){
            int park = queue.poll();
            for(int nei: graph.get(park)){
                if(distance[nei] == -1){
                    queue.add(nei);

                    distance[nei] = distance[park] + 1;
                }
            }
        }
        
        return distance[A];
    }
}

 */

// gas station
/*public class Solution {
    public int canCompleteCircuit(final int[] A, final int[] B) {
        int totalgas = 0;
        int totalcost = 0;
        int startidx = 0;
        int currgas = 0;
        
        for(int i = 0; i < A.length; i++){
            totalgas += A[i];
            totalcost += B[i];
            
            currgas += A[i] - B[i];
            
            if(currgas < 0){
                startidx = i + 1;
                currgas = 0;
            }
        }
        
        return (totalgas >= totalcost) ? startidx : -1;
    }
}
 */