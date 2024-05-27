public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (A != null && B != null) {
            if (A.val <= B.val) {
                current.next = A;
                A = A.next;
            } else {
                current.next = B;
                B = B.next;
            }
            current = current.next;
        }

        if (A != null) {
            current.next = A;
        } else {
            current.next = B;
        }
        return dummy.next;
    }
}