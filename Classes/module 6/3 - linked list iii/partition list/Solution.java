

public class Solution {
    public ListNode partition(ListNode A, int B) {
        ListNode lessHead = new ListNode(0);  // Dummy head for less partition
        ListNode greaterHead = new ListNode(0);  // Dummy head for greater partition

        ListNode less = lessHead;  // Pointer for less partition
        ListNode greater = greaterHead;  // Pointer for greater partition

        ListNode current = A;  // Pointer for traversing the original list

        // Traverse the original list
        while (current != null) {
            if (current.val < B) {
                less.next = current;  // Add node to less partition
                less = less.next;
            } else {
                greater.next = current;  // Add node to greater partition
                greater = greater.next;
            }
            current = current.next;
        }

        greater.next = null;  // End the greater partition list
        less.next = greaterHead.next;  // Connect less partition list to greater partition list

        return lessHead.next;  // Return the head of the new partitioned list
    }
}
