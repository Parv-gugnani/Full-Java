public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null){
            return null;
        }

        RandomListNode curr = head;

        while(curr != null){
            RandomListNode newNode = new RandomListNode(curr.label);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        curr = head;
        while(curr != null){
            if(curr.random != null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head;
        RandomListNode newHead = head.next;
        RandomListNode temp;

        while(curr != null){
            temp = curr.next;
            curr.next = temp.next;
            if(temp.next != null){
                temp.next = temp.next.next;
            }

            curr = curr.next;
        }

        return newHead;
    }
}
