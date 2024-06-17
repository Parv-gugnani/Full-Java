public class Solution {
    public ArrayList<Integer> solve(int A) {
            ArrayList<Integer> result = new ArrayList<>();
        if (A <= 0) {
            return result;
        }

        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");

        while (result.size() < A) {
            String current = queue.poll();
            result.add(Integer.parseInt(current));

            queue.add(current + "1");
            queue.add(current + "2");
            queue.add(current + "3");
        }

        return result;

    }
}