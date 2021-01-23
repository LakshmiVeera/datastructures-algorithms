package LinkedLists;
import java.util.*;

class LinkedListCycle {
    public boolean detectCycle(Node node) {
        if(node == null) {
            return false;
        }
        Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        while(node != null) {
            if(map.get(node.data) == null) {
                map.put(node.data, true);
            } else {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public static void main(String[] args){
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        Node head = new Node(3);
        Node node2 = new Node(4);
        Node node3 = new Node(5);
        Node node4 = new Node(3);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println(linkedListCycle.detectCycle(head));
    }
}

