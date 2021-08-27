package codetop;
public class ReverseKGroupListNode {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tail = head;
        for (int i = 0; i < k; i++) {
            //当数量不足k的时候，返回head节点，不需要翻转了
            if (tail == null) return head;
            tail = tail.next;
        }
        //开始翻转[head,tail)范围内的链表，并返回翻转后的新的节点，也就是tail节点的上一个节点
        ListNode new_head = reverse(head, tail);
        //递归翻转以tail为头节点的如下部分链表
        head.next = reverseKGroup(tail, k);
        return new_head;//返回翻转后的新的头节点
    }

    //过程建figure.c
    private ListNode reverse(ListNode head, ListNode tail) {
        ListNode prev = null, cur = null;
        //判断条件变成
        while (head != tail) {
            cur = head.next;//step1
            head.next = prev;//step2
            prev = head;//step3
            head = cur;//step4
        }
        return prev;

    }
}

