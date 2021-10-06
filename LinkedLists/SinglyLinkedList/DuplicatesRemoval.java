package LinkedLists.SinglyLinkedList;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesRemoval {
    public void removeDuplicates(Node node) {
        Map<Integer, Boolean> hashMap = new HashMap();
        Node prev = null;
        while(node != null) {
            if (hashMap.get(node.data) == null) {
                hashMap.put(node.data, true);
                prev = node;
            } else {
                prev.next = node.next;
            }
            node = node.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(1);
        head.next.next.next.next.next.next = new Node(3);
        head.next.next.next.next.next.next.next = new Node(5);

        DuplicatesRemoval linkedList = new DuplicatesRemoval();
        linkedList.removeDuplicates(head);

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }
}
