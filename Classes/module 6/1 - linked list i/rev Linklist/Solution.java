
public class Solution {
    public ListNode reverseList(ListNode A) {
        ListNode prev = null;
        ListNode current = A;
        ListNode nextNode = null;
        
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        
        return prev;
    }
}