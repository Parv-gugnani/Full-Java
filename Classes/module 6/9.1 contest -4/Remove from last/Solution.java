ListNode* Solution::removeNthFromEnd(ListNode* A, int B) {
    ListNode* dummy = new ListNode(0);
    dummy->next = A;
    ListNode* first = dummy;
    ListNode* second = dummy;

    for(int i = 0; i <= B; i++){
        if(first != nullptr){
            first = first->next;
        } else {
            ListNode* toDelete = dummy->next;
            ListNode* newHead = toDelete->next;
            delete toDelete;
            delete dummy;
            return newHead;
        }
    }

    while(first != nullptr){
        first = first->next;
        second = second->next;
    }

    ListNode* toDelete = second->next;
    second->next = second->next->next;
    delete toDelete;

    ListNode* head = dummy->next;
    delete dummy;
    return head;
}
