package LinkedLists;
import java.util.Scanner;

class SingleLinkedList {
    public Node1 appendNode(Node1 head, int data, int position) {
        Node1 currentNode = head;
        int nodePosition = 0;

        while (currentNode.next != null ) {
            if(position == 0) {
                Node1 newHead = new Node1(data);
                newHead.next = head;
                head = newHead;
            }
            if(position == nodePosition && nodePosition != position-1) {
                Node1 tmp = currentNode.next;
                Node1 newNode = new Node1(data);
                currentNode.next = newNode;
                newNode.next = tmp;
            }
            nodePosition+=1;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node1 currentNode = new Node1();
        Node1 head = new Node1();
        for (int i = 0; i < n; i++) {
            int data = in.nextInt();
            if (i == 0) {
                head = new Node1(data);
                currentNode = head;
            }
            else {
                currentNode.next = new Node1(data);
                currentNode = currentNode.next;
            }
        }
        in.close();
        SingleLinkedList solution = new SingleLinkedList();
        solution.appendNode(head, 2, 3);
    }
}

class Node1 {
    int data;
    Node1 next;
    int position;

    public Node1() {
    }
    public Node1(int data) {
        this.data = data;
    }
}
