package LinkedLists;

public class LinkedListNode {
    public static void main(String... args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node three = new Node(3);
        head.next = second;
        second.next = three;
        printNodes(head);
    }

    public static void printNodes(Node node) {
        if(node == null) {
            return;
        }
        System.out.println(node.data);
        printNodes(node.next);
    }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data =  data;
        this.next = null;
    }
}
