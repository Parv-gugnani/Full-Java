import java.util.HashMap;

class ListNode {
    int key;
    int value;
    ListNode prev;
    ListNode next;

    ListNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class Solution {
    private final int capacity;
    private final HashMap<Integer, ListNode> map;
    private final ListNode head;
    private final ListNode tail;

    public Solution(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new ListNode(-1, -1);
        this.tail = new ListNode(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            ListNode node = map.get(key);
            removeNode(node);
            addNodeToFront(node);
            return node.value;
        } else {
            return -1;
        }
    }

    public void set(int key, int value) {
        if (map.containsKey(key)) {
            ListNode node = map.get(key);
            node.value = value;
            removeNode(node);
            addNodeToFront(node);
        } else {
            if (map.size() == capacity) {
                ListNode nodeToRemove = tail.prev;
                removeNode(nodeToRemove);
                map.remove(nodeToRemove.key);
            }
            ListNode newNode = new ListNode(key, value);
            addNodeToFront(newNode);
            map.put(key, newNode);
        }
    }

    private void removeNode(ListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addNodeToFront(ListNode node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}
