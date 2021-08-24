package codetop;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        //注意这里是使用的set来存ListNode
        Set<ListNode> visited = new HashSet<ListNode>();
        while (pos != null) {
            if (visited.contains(pos)) {
                return pos;
            } else {
                visited.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }

    }


}
