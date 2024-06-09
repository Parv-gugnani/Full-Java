
ListNode merge(ListNode a, ListNode b) {
    if (a == null)
        return b;
    if (b == null)
        return a;
    ListNode result;
    if (a.val < b.val) {
        result = a;
        result.down = merge(a.down, b);
    } else {
        result = b;
        result.down = merge(a, b.down);
    }
    return result;
}

ListNode flatten(ListNode root) {
    if (root == null || root.right == null)
        return root;
    return merge(root, flatten(root.right));
}