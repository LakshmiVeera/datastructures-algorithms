package LinkedLists;

public class ReverseLinkedList {
    Node prev = null;
    public Node reverseLinedList(Node current) {
        while(current != null) {
            Node tempNode = current.next;
            current.next = prev;
            prev = current;
            current = tempNode;
        }
        return prev;
    }
    public static void main(String... args) {
        Node head = new Node(3);
        Node second = new Node(4);
        Node third = new Node(5);
        Node fourth = new Node(6);
        head.next = second;
        second.next = third;
        third.next = fourth;

        ReverseLinkedList singleLinkedList = new ReverseLinkedList();
        Node reverseHead = singleLinkedList.reverseLinedList(head);

        while(reverseHead != null) {
            System.out.println(reverseHead.data);
            reverseHead = reverseHead.next;
        }
    }
}
