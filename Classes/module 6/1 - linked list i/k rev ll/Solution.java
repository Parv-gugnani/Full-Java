
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        if (A == null || B == 1) return A;
        
        ListNode dummy = new ListNode(0);
        dummy.next = A;
        ListNode curr = dummy, nex = dummy, pre = dummy;
        int count = 0;
        
        // Count the number of nodes in the linked list
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }
        
        // Reverse in groups of size B
        while (count >= B) {
            curr = pre.next; // The first node of the current group
            nex = curr.next; // The second node of the current group
            for (int i = 1; i < B; i++) {
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
            pre = curr;
            count -= B;
        }
        
        return dummy.next;
    }
}
