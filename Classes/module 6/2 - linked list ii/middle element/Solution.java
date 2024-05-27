
public class Solution {
    public int solve(ListNode A) {
        if (A == null) {
            throw new IllegalArgumentException("The linked list is empty");
        }

        ListNode slow = A;
        ListNode fast = A;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.val;
    }
}
