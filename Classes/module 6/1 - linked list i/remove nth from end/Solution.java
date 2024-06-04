public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode dummy = new ListNode(0);
        dummy.next = A;
        ListNode first = dummy;
        ListNode second = dummy;

        for(int i =0; i <= B; i++){
            if(first != null){
                first  = first.next;
            }
            else{
                return dummy.next.next;
            }
        }

        while(first != null){
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return dummy.next;

    }
}