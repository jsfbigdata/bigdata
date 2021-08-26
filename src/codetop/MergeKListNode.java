package codetop;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKListNode {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        //队列中永远放k个节点
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.value < o2.value) return -1;
                else if (o1.value == o2.value) return 0;
                else return 1;
            }
        });
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        for (ListNode node : lists) {
            //先把每个ListNode的头节点放进去
            if (node != null) queue.add(node);
        }
        while (!queue.isEmpty()) {
            //依次弹出头节点，
            p.next = queue.poll();
            p = p.next;
            //下一个节点不为空，就把这个节点塞进去，这一点比较关键
            if (p.next != null) queue.add(p.next);
        }
        return dummy.next;
    }

}
