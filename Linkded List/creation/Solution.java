import java.io.*;

public class Solution {
    public class linklist{
        Node head;

        static class Node{
            int data;
            Node next;

            Node(int d){
                data = d;
                next = null;
            }
        }
    }

    public static linklist insert(linklist list, int data){
        Node new_node = new Node(data);

        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node last = list.head;

            while(last.next != null){
                last = last.next;
            }

            last.next = new_node;
        }
        return list;
    }
    
}
