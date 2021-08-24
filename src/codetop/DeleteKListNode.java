package codetop;

public class DeleteKListNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        int length = getLength(head);
        ListNode cur = dummy;
        //获取长度，定位到
        for (int i = 1; i < length - n + 1; ++i) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        //从这里开始做node的遍历
        ListNode ans = dummy.next;
        return ans;
    }
    public int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }
}
