package LinkedLists;
import java.util.*;

class DetectCycle {
    public boolean detectCycle(Node head) {
        if(head == null) {
            return false;
        }
        Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        Node current = head;
        while(current.next != null) {
            if(map.get(current.data)){
                return true;
            }
            map.put(current.data, true);
            current = current.next;
        }
        return false;
    }
}
