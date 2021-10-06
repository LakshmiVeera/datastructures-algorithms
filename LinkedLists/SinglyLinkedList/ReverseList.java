package LinkedLists.SinglyLinkedList;

// 1->2->3

// 3->2->1

public class ReverseList {
    public Node reverse(Node node) {
        Node prev = null;
        while(node != null) {
            Node tempNode = node.next;
            node.next = prev;
            prev = node;
            node = tempNode;
        }
        return prev;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        ReverseList list = new ReverseList();
        Node reverseHead = list.reverse(head);

        while(reverseHead != null) {
            System.out.println(reverseHead.data);
            reverseHead = reverseHead.next;
        }
    }
}
