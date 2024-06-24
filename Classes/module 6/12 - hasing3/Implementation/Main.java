import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 5, 4, 11, 7, 5, 2, 6, 8};
        MyHashMap hm = new MyHashMap();

        for (int element : arr) {
            if (hm.containsKey(element)) {
                int value = hm.get(element);
                hm.put(element, value + 1);
            } else {
                hm.put(element, 1);
            }
        }

        hm.print();
    }
}

class Node {
    int key;
    int value;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashMap {
    int nodes;
    double lambda = 0.75;
    int initialSize = 5;
    LinkedList<Node>[] buckets;

    MyHashMap() {
        buckets = new LinkedList[initialSize];
        for (int i = 0; i < initialSize; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void put(int key, int value) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node> ll = buckets[bucketIndex];
        int elementIndex = searchForElementInLL(ll, key);

        if (elementIndex == -1) {
            ll.addLast(new Node(key, value));
            nodes++;
        } else {
            ll.get(elementIndex).value = value;
        }

        double loadFactor = (nodes * 1.0) / buckets.length;
        if (loadFactor > lambda) {
            rehash();
        }
    }

    public int get(int key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node> ll = buckets[bucketIndex];
        int elementIndex = searchForElementInLL(ll, key);

        if (elementIndex == -1) {
            throw new NoSuchElementException("Key not found: " + key);
        } else {
            return ll.get(elementIndex).value;
        }
    }

    private void rehash() {
        LinkedList<Node>[] temp = buckets;
        buckets = new LinkedList[temp.length * 2];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
        nodes = 0;

        for (LinkedList<Node> ll : temp) {
            for (Node n : ll) {
                put(n.key, n.value);
            }
        }
    }

    public boolean containsKey(int key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<Node> ll = buckets[bucketIndex];
        int elementIndex = searchForElementInLL(ll, key);
        return elementIndex != -1;
    }

    public int size() {
        return nodes;
    }

    private int getBucketIndex(int key) {
        return key % buckets.length;
    }

    private int searchForElementInLL(LinkedList<Node> ll, int key) {
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).key == key) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (LinkedList<Node> ll : buckets) {
            for (Node n : ll) {
                System.out.println("Key: " + n.key + ", Value: " + n.value);
            }
        }
    }
}
