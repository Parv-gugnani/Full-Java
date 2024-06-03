
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if (A == null || B == C) return A;
        
        ListNode dummy = new ListNode(0);
        dummy.next = A;
        
        ListNode pre = dummy;
        for (int i = 1; i < B; i++) {
            pre = pre.next;
        }
        
        ListNode start = pre.next;
        ListNode then = start.next;
        
        for (int i = 0; i < C - B; i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        
        return dummy.next;
    }
}