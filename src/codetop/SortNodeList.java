package codetop;

import java.util.PriorityQueue;

public class SortNodeList {
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode p = head;
        //先遍历，后构造
        while (p != null) {
            //放入优先队列
            pq.offer(p.value);
            p = p.next;
        }
        ListNode q = new ListNode(0);
        ListNode resHead = q;
        while (pq.size() > 0) {
            //抽出来结果，value出来
            q.value = pq.poll();
            if (pq.size() > 0) {
                //
                ListNode temp = new ListNode(0);
                q.next = temp;
            }
            q = q.next;
        }
        return resHead;
    }
}
